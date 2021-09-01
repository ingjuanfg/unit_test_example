package com.ingjuanfg;

public class Calculator {
    private int numeroUno;
    private int numeroDos;

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int suma(int numeroUno, int numeroDos){
        return numeroUno + numeroDos;
    }
}
