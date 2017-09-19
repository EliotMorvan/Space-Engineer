/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceengineer;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;

/**
 *
 * @author em179727
 */
public class Bloc extends ObjetTouchable {

    //degréAbimé varie de façon a changer le sprite du bloc.
    private int degreAbime;
    
    public Bloc(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        degreAbime = 0;
    }
    
    //retourne l'état actuel du bloc
    public int getab(){
        return degreAbime;
    }
    
    //fixe un nouvelle valeur à l'état du bloc
    public void setab(int x){
        degreAbime = x;
    }

    //les collisions des bloc sont gérés dans les fonction de Projectile et Asteroide
    @Override
    public void effetCollision(Objet objet) {
    }

    @Override
    public void evoluer(long l) {
    }
    
}

