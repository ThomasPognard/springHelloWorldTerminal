package org.ldv.sio.slam.lights.impl;

import org.ldv.sio.slam.lights.Eclairage;
/**
 * Implémentation d'une ampoule à incandescence 
 * 
 * @author Frederic Varni
 *
 */
public class AmpouleIncandescente implements Eclairage {

    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */
    private int etat;

    /**
     * Calcule la probabilité qu'une ampoule tombe en panne
     * @return 0 l'ampoule fonctione, -1 l'ampoule est en panne
     */
    private int probaPanne() {
        // TODO implémenter la probabilité que l'ampoule à incandescence 
        //      tombe en panne à l'allumage
        return 0;
    }

    /**
     * Constructeur
     */
    public AmpouleIncandescente() {
        // TODO initialiser la lampe
    }

    /**
     * Allume l'ampoule à pleine puissance
     */
    @Override
    public void allumer() {
        // TODO gérer la logique d'allumage
    }

    /**
     * Eteint l'ampoule
     */
    @Override
    public void eteindre() {
        // TODO gérér la logique d'extinction

    }

    /**
     * Augmente l'intensité lumineuse de l'ampoule
     */
    @Override
    public void intensifier() {
        // TODO gérer la logique d'augmentation de l'intensité
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    @Override
    public void diminuer() {
        // TODO gérer la logique de diminution de l'intensité lumineuse
    }

    /**
     * Permet de connaître l'état de l'ampoule
     * @return l'état de la lampe 0..10 ou -1 si en panne
     */
    @Override
    public int etat() {
        // TODO retourner l'état effectif de l'ampoule
        return 0;
    }

    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    public String toString() {
        // TODO retourner dans la chaîne le nom de la classe et l'état de l'ampoule
        return "";
        
    }

}
