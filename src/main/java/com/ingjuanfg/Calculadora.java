package com.ingjuanfg;

public class Calculadora {
    private String numUno;
    private String numDos;

    public String getNumUno() {
        return numUno;
    }

    public void setNumUno(String numUno) {
        this.numUno = numUno;
    }

    public String getNumDos() {
        return numDos;
    }

    public void setNumDos(String numDos) {
        this.numDos = numDos;
    }

    public int suma(int numUno, int numDos){
        return numUno + numDos;
    }
}
