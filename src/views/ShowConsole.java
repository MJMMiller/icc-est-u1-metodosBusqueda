package views;

import java.util.Scanner;

public class ShowConsole {

    private Scanner sc = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Método de Búsqueda");
    }

    public int getCode(){
        System.out.print("Ingrese el código: ");
        while (!sc.hasNextInt()) {
            System.out.println("Código inválido. Intente de nuevo:");
            sc.next();
        }
        int codigo = sc.nextInt();
        return codigo;
    }

    public String getName(){
        System.out.print("Ingrese el nombre: ");
        while (!sc.hasNext()) {
            System.out.println("Código inválido. Intente de nuevo:");
            sc.next();
        }
        String name = sc.next();
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}