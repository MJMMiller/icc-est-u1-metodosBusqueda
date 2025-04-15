package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo = {1, 2, 3, 4, 5};
    private int elemento = 3;

    ShowConsole showConsole = new ShowConsole();


    public static int busquedaLineal(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}