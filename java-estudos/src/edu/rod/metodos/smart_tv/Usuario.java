package edu.rod.metodos.smart_tv;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(4);
        System.out.println("Canal: " + smartTv.canal);
    }
}
