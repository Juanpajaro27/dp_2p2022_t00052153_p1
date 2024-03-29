package com.mycompany.videogame;

public class SuperHumanos extends Personajes implements IFichaB {
    
    /*
    Clase que representa el tipo de personaje SuperHumano
    */
    public int fuerzaSuperHum;

    public SuperHumanos(int fuerzaSuperHum, String nombre, int vida, int defensa, int fuerza) {
        super(nombre, vida, defensa, fuerza);
        this.fuerzaSuperHum = fuerzaSuperHum;
    }

    public int getFuerzaSuperHum() {
        return fuerzaSuperHum;
    }

    public void setFuerzaSuperHum(int fuerzaSuperHum) {
        this.fuerzaSuperHum = fuerzaSuperHum;
    }
    
    @Override
    public int ataque() {
        int fuerza_total=0;
        fuerza_total= fuerza + fuerzaSuperHum + Ataquesimple();
        return fuerza_total;
    }

    @Override
    public int setVida(int atact, int defense) {
        int vida=100;
        if((atact-defense) > 0 ){
            vida= vida-(atact-defense);
            System.out.println("Le queda "+ vida+" de vida");
        }else{
            System.out.println("Estas muert@");
            vida=0;
        }
        return vida;
    }

    @Override
    public int Ataquesimple() {
        int extrapoder=0;
        extrapoder = SuperHumanos.fuerzaExtra;
        System.out.println("Estas realizando un ataque Simple, con danio "+extrapoder);
        return extrapoder;
    }

    @Override
    public int Defensaferreo() {
        int defensaextra=0;
        
        defensaextra = SuperHumanos.defensaExtra + defensa;
        System.out.println("Se esta realizando una defensa ferrea, con efecto de "+ defensaextra);
        return defensaextra;
    } 
    
}
