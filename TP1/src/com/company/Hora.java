package com.company;

public class Hora {

    private int hora, minuto, segundo;

    //Setters
    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = (hora>=0 && hora < 24) ? hora : 0;
        this.minuto = (minuto>=0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    //Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Metodos

    public void avanzarSegundo() {
        if (this.segundo + 1 >= 60) {
            this.minuto += 1;
            this.segundo = 0;
        } else {
            this.segundo += 1;
        }

    }

    public void retrocederSegundo() {

        if (this.segundo - 1 < 0) {
            this.minuto -= 1;
            this.segundo = 59;
        } else {
            this.segundo -= 1;
        }
    }

    //imprimir hora
    @Override
    public String toString() {
        String hh = String.format("%02d", hora);
        String mm = String.format("%02d", minuto);
        String ss = String.format("%02d", segundo);

        return hh + ":" + mm + ":" + ss;
    }


}
