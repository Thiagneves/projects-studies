#include <LedControl.h>

int DIN = 13;
int CS = 12;
int CLK   = 11;
LedControl lc=LedControl(DIN, CLK, CS,0);

int coracao[8] = {B00000000, B01100110, B11111111, B11111111, B11111111, B01111110, B00111100, B00011000};

void setup() {

  lc.shutdown(0,false);
  lc.setIntensity(0,0);
  lc.clearDisplay(0);

}

void loop() {

  for (int i = 0; i < 8; i++) {
    lc.setRow(0, i, coracao[i]);
  }
  delay(5000);

  lc.clearDisplay(0);

}
