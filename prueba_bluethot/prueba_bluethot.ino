#include <Keyboard.h>
#include <SoftwareSerial.h>   // Incluimos la librería  SoftwareSerial

SoftwareSerial BT(8,9);    // Definimos los pines RX y TX del Arduino conectados al Bluetooth

void setup()
{
  BT.begin(9600);       // Inicializamos el puerto serie BT (Para Modo AT 2)
  Serial.begin(9600);   // Inicializamos  el puerto serie  
}
 
void loop()
{
  if(BT.available())    // Si llega un dato por el puerto BT se envía al monitor serial
  {
    char info = BT.read();
    switch (info){
      case '1':
        Keyboard.begin();   
        Keyboard.print("Un cordial saludo!, mi nombre es <nombre>, luego de analizar detalladamente los requerimientos que tiene la empresa y me considero un candidato capaz de dar la talla.");
        delay(500);
        Keyboard.releaseAll();
      break;
      case '2':
        Keyboard.begin();   
        Keyboard.print("gmail.com");
        delay(500);
        Keyboard.releaseAll();
      break;
      case '3':
        Keyboard.begin();   
        Keyboard.print("hotmail.com");
        delay(500);
        Keyboard.releaseAll();
      break;
      case '4':
        Keyboard.begin();   
        Keyboard.print("udabol.edu.bo");
        delay(500);
        Keyboard.releaseAll();
      break;
      case '5':
        Keyboard.begin();
        Keyboard.press(KEY_LEFT_GUI);
        Keyboard.press('r');
        Keyboard.releaseAll();
        delay(200);
        Keyboard.println("charmap");
        Keyboard.println("");
        Keyboard.press(KEY_RETURN);
        Keyboard.releaseAll();
      break;
      case '6':
        Keyboard.begin();
        Keyboard.press(KEY_LEFT_GUI);
        Keyboard.press('r');
        Keyboard.releaseAll();
        delay(200);
        Keyboard.println("notepad");
        Keyboard.println("");
        Keyboard.press(KEY_RETURN);
        Keyboard.releaseAll();
      break;
      case '7':
        Keyboard.begin();
        Keyboard.press(KEY_LEFT_GUI);
        Keyboard.press('r');
        Keyboard.releaseAll();
        delay(200);
        Keyboard.println("calc");
        Keyboard.println("");
        Keyboard.press(KEY_RETURN);
        Keyboard.releaseAll();
      break;
      case '8':
        Keyboard.begin();   
        Keyboard.print("Si inge, se escucha bien");
        delay(500);
        Keyboard.releaseAll();
      break;             
    }
      
  }
 
  if(Serial.available())  // Si llega un dato por el monitor serial se envía al puerto BT
  {
     BT.write( Serial.read());     
  }
}
