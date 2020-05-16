package com.company.ex1;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    int sumaparametros=0;
    

    public void calcularmitjana (){
        System.out.println("cauntos parametros deseasr introducir?");
        int numeroparametros=sc.nextInt();
        System.out.println("introduzca parametros");
        for (int i = 0; i <numeroparametros ; i++) {
            int numero = sc.nextInt();
        sumaparametros=sumaparametros+numero;
        }
        int mediana=sumaparametros/numeroparametros;
        System.out.println("la mitjana es :"+mediana);
    }

        public  void moda(){
            System.out.println("cauntos parametros deseasr introducir?");
            int parametros= sc.nextInt();
            int maximaVecesQueSeRepite = 0;
            int moda = 0;
            int M[] = new int[parametros];
            System.out.println("introduzca parametros");
            for (int i = 0; i <M.length ; i++) {
                M[i]=sc.nextInt();
            }


            for(int i=0; i<M.length; i++){
                int vecesQueSeRepite = 0;
                for(int j=0; j<M.length; j++){
                    if(M[i] == M[j])
                        vecesQueSeRepite++;
                }
                if(vecesQueSeRepite > maximaVecesQueSeRepite){
                    moda = M[i];
                    maximaVecesQueSeRepite = vecesQueSeRepite;
                }
            }

            System.out.println("La moda es "+moda+" y se repitió "+maximaVecesQueSeRepite+" veces.");
        }
        public void suma(){
            System.out.println("cauntos parametros deseasr introducir?");
            int parametros= sc.nextInt();

            int suma=0;
            int M[] = new int[parametros];
            System.out.println("introduzca parametros");
            for (int i = 0; i <M.length ; i++) {
                M[i]=sc.nextInt();
                suma+=M[i];
            }
            System.out.println("La suma de todos los parametros es : " +suma);

        }
    }





