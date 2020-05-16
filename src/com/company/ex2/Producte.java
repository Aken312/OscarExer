package com.company.ex2;

import com.company.ex2.Comanda;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Producte implements Serializable {

    public static final long serialVersionUID = 1L;
    private String descripcio;
    private int idproducte;
    private int stockActual;
    private int stockMinim;
    private float preu;
    private PropertyChangeSupport propertyChangeSupport;

    public Producte(){

    }

    public Producte(int idproducte,String descripcio, int stcokActual, int stockMinim,float preu){
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.descripcio = descripcio;
        this.idproducte = idproducte;
        this.stockActual = stcokActual;
        this.stockMinim = stockMinim;
        this.preu = preu;
    }

    public String getDescripcio() {return this.descripcio;}
    public void setDescripcio(String descripcio){this.descripcio = descripcio;}
    public int getIdproducte() {return  this.idproducte;}
    public void setIdproducte(int idproducte){this.idproducte = idproducte;}
    public int getStcokActual(){return this.stockActual;}

    public void setStcokActual (int nouValor){
        int valorAnterior = this.stockActual;
        this.stockActual = nouValor;
        if (this.stockActual < this.getStockMinim()){
            this.propertyChangeSupport.firePropertyChange("stockActual",valorAnterior,this.stockActual);
        }
    }
    public int getStockMinim(){return this.stockMinim;}
    public void setStockMinim(int stockMinim){this.stockMinim = stockMinim;}
    public float getPreu(){return this.preu;}
    public void setPreu(float preu){this.preu = preu;}

    public void addPropertyChangeListener(Comanda comanda){
        this.propertyChangeSupport.addPropertyChangeListener(comanda);
    }
}

