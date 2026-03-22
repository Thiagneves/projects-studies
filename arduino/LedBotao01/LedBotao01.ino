#define led 3
#define botao 2

void setup() {
  pinMode(led, OUTPUT);
  pinMode(botao, INPUT);
}

void loop() {
  if(digitalRead(botao)){
    digitalWrite(led, !digitalRead(led));
    delay(300);
  }
}

