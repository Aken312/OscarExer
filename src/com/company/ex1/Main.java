
package com.company.ex1;

import com.company.ex2.Comanda;
import com.company.ex2.Producte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("que operacion queires relizar?");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();
        switch (decision){
            case 1:

                calculadora.calcularmitjana();
            case 2:
                calculadora.moda();
            case 3:
                calculadora.suma();
        }

    }
}