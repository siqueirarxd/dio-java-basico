package edu.rod.metodos.smart_tv;

public class SmartTV {
   boolean ligada = false;
   int volume = 25;
   int canal = 1;

   public void ligar(){
    ligada = true;
   }
   public void desligar(){
    ligada = false;
   }

   public void aumentarVolume() {
    volume++;
   }

   public void diminuirVolume() {
    volume--;
   }

   public void aumentarCanal(){
    canal++;
   }

   public void diminuirCanal(){
    canal--;
   }

   public void mudarCanal(int novoCanal){
    canal = novoCanal;
   }
}
