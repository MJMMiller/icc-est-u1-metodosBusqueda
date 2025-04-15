package controllers;

import views.ShowConsole;

public class MetodosBusqueda {


    public MetodosBusqueda(){
        ShowConsole showConsole = new ShowConsole();
    }
    
    public int busquedaLineal(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}