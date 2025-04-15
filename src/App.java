import controllers.MetodosBusqueda;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole showConsole = new ShowConsole();

        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        
        int[] arreglo = {1, 2, 3, 4, 5};
        int elemento = 3;

        int valor = metodosBusqueda.busquedaLineal(arreglo, elemento);
        System.out.println(valor+1);


    }
}
