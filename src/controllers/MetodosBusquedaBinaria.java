package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusquedaBinaria {

    private Person[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Person[] people){
        this.pantalla = new ShowConsole();
        this.people = people;
    }

    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto){
            int central = (bajo + alto) / 2;

            if (people[central].getCode() == code){
                return central;
            }

            if (people[central].getCode() < code) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = pantalla.getCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("Persona con código " + codeToFind + " no encontrada.");
        } else {
            pantalla.showMessage("Persona encontrada:");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void ordenarPorNombreBurbuja() {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
    
    private int findPersonByName(String name) {
        int low = 0;
        int high = people.length - 1;
    
        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = people[mid].getName();
    
            int comparison = midName.compareToIgnoreCase(name);
    
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    
        return -1;
    }
    
    public void showPersonByName() {
        ordenarPorNombreBurbuja();
        String nameToFind = pantalla.getName();
        int indexPerson = findPersonByName(nameToFind);
    
        if (indexPerson == -1) {
            pantalla.showMessage("Persona con nombre \"" + nameToFind + "\" no encontrada.");
        } else {
            pantalla.showMessage("Persona encontrada:");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }
}    