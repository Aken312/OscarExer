package com.company.ex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.Date;

public class Comanda implements Serializable, PropertyChangeListener {

    public static final long serialVersionUID =2;
    private int numerocomanda;
    private int idproducte;
    private Date data;
    private int nombre;
    private boolean demanar;

    public Comanda(){

    }

    public Comanda(int numerocomanda, int idproducte,Date data,int nombre,boolean demanar){
        this.numerocomanda = numerocomanda;
        this.idproducte = idproducte;
        this.data = data;
        this.nombre = nombre;
        this.demanar = demanar;

    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Stock anterior " + event.getOldValue());
        System.out.println("Stock actual " + event.getNewValue());
        setDemanar(true);

    }
    public int getNumerocomanda(){return numerocomanda;}

    public void setNumerocomanda(int numerocomanda){
        this.numerocomanda = numerocomanda;
    }

    public int getIdproducte(){return  idproducte;}
    public void setIdproducte(int idproducte ){this.idproducte = idproducte;}
    public Date getData(){return data;}
    public void setData(Date data){this.data = data;}
    public int getNombre(){return nombre;}
    public void setNombre(int nombre){this.nombre = nombre;}
    public boolean isDemanar(){return demanar;}
    public void  setDemanar(boolean demanar){this.demanar=demanar;}

}
