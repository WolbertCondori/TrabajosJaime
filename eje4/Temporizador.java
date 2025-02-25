package eje4;

import java.util.Scanner;

public class Temporizador {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        System.out.println("creando mensaje personalizado porfavor espere");
        Thread.sleep(4000);
        System.out.print(".");
        Thread.sleep(4000);
        System.out.print(".");
        Thread.sleep(4000);
        System.out.println(".");
        Thread.sleep(2000);
        System.out.println("hola, "+palabra+" Bienvenido devuelta");
    }
}
