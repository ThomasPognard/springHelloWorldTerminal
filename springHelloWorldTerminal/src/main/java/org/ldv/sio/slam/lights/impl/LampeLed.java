package org.ldv.sio.slam.lights.impl;

import org.ldv.sio.slam.lights.Lampe;

public class LampeLed implements Lampe {

    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */
    private int etat;

    public LampeLed() {
        etat = 0;
    }

    @Override
    public void allumer() {
        etat = 10;

    }

    @Override
    public void eteindre() {
        etat = 0;

    }

    @Override
    public void intensifier() {
        etat++;
    }

    @Override
    public void diminuer() {
        etat--;
    }

}
