#include "LedControl.h"
LedControl lc = LedControl(13, 11, 12, 1); // DIN, CLK, CS, nº de displays

byte coracao_menor[] = {
  B00000000,
  B00100100,
  B01111110,
  B01111110,
  B01111110,
  B00111100,
  B00011000,
  B00000000
};

byte coracao_maior[] = {
  B01100110,
  B11111111,
  B11111111,
  B11111111,
  B11111111,
  B01111110,
  B00111100,
  B00011000
};

void setup() {
  lc.shutdown(0, false); // Liga o display
  lc.setIntensity(0, 8); // Brilho (0 a 15)
  lc.clearDisplay(0);    // Limpa a tela
}

void mostraFrame(byte frame[]) {
  for (int i = 0; i < 8; i++) {
    lc.setRow(0, i, frame[i]);
  }
}

void loop() {
  mostraFrame(coracao_menor);
  delay(300);
  mostraFrame(coracao_maior);
  delay(300);
}
