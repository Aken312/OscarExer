
package com.company.ex2;

import com.company.ex2.Comanda;
import com.company.ex2.Producte;

public class Main {

    public static void main(String[] args) {
        Producte nouProducte = new Producte(1, "Prana abd.234",10, 3,16);
        Comanda novaComanda = new Comanda();

        nouProducte.addPropertyChangeListener(novaComanda);
        nouProducte.setStcokActual(2);

        if (novaComanda.isDemanar()){
            System.out.println("Realitzar comanda a producte: " + nouProducte.getDescripcio());
        }else{
            System.out.println("No es necessari realitzar comanda a producte " + nouProducte.getDescripcio());
        }
    }
}
