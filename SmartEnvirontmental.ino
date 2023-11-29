#include <DHT.h>
#include <ESP8266HTTPClient.h>
#include <ESP8266WiFi.h>



// Konfigurasi sensor DHT11
#define DHTPIN D5  // Pin data sensor terhubung ke pin D5 pada Wemos D1 Mini
#define DHTTYPE DHT11  // Tipe sensor DHT

const char* ssid = "Kpk";
const char* pass = "sebentarmas";

const char* server = "192.168.1.52";

const int fotoresistorPin = A0;

// Inisialisasi sensor DHT
DHT dht(DHTPIN, DHTTYPE);

void setup() {
  Serial.begin(115200);
  dht.begin();

  //WiFi.hostname("NodeMCU");
  WiFi.begin(ssid, pass);
  while(WiFi.status() != WL_CONNECTED){
    // Jika tidak dapat terkoneksi maka system akan mencoba secara terus menerus hingga terkoneksi
    Serial.print("▇");
    delay(1000);
  } //I don't understand English hahaha

  Serial.println("✅ ➠ Connected Success");
}

void loop() {
  // Membaca suhu dari sensor DHT
  float humidity = dht.readHumidity();
  int temperature = dht.readTemperature();

  int fotoresistorValue = analogRead(fotoresistorPin);

  // Memeriksa apakah pembacaan suhu berhasil
  if (isnan(humidity) || isnan(temperature) || isnan(fotoresistorValue)) {
    Serial.println("Gagal membaca dari sensor DHT");
    return; 
  }
  Serial.println("Kelembaban ➠ " + String(humidity) + "% | Temperature ➠ " + String(temperature) + "°C | Intensity ➠ " + String(fotoresistorValue));

  WiFiClient client;

  const int httpPort = 3306;

  if(!client.connect(server, httpPort)){
    Serial.println("🗿 Gagal terkoneksi web server anjir!");
delay(5000);  // Tunggu 5 detik sebelum mencoba kembali
return;
  }

  HTTPClient http;
  
  String link = "http://" + String(server) + "/grafiksensor/kirimdata.php?temperature=" + String(temperature) + "&humidity=" + String(humidity) + "&intensity=" + String(fotoresistorValue);
  http.begin(client, link);
  http.GET();

  String response = http.getString();
  Serial.println(response);


  delay(5000);
}

// isFinished
