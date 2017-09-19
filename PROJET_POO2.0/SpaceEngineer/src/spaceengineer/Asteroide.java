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
public class Asteroide extends ObjetTouchable{
     
    //l'angle est la direction que l'asteroide doit prendre 
    //l'attribut vitesse n'est pas nécessaire puisqu'elle est constante
    private double angle;
    private final JeuSpaceEngineer spaceEngineer;
    private int degreUsure;
    public Asteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        //0, 360, 720.. correspondent à aller à droite
        //180, 540.. à aller a gauche
        angle = 0;
        spaceEngineer = (JeuSpaceEngineer) g;
    }

    @Override
    public void effetCollision(Objet objet) {
        
    if("spaceengineer.Asteroide".equals(objet.getClass().getName())){
        Bloc modif = (Bloc) objet;
        int degreUsure;
        degreUsure = modif.getab();
        if(degreUsure == 0){
            objet.changeSprite("bloc2");
            leJeu().supprimer(this);
        }
        if(degreUsure == 3){
            objet.changeSprite("bloc3");
            leJeu().supprimer(this);
        }
        
        if(degreUsure == 5){
            leJeu().supprimer(this);
            leJeu().supprimer(objet);
        }
        modif.setab(degreUsure + 1);
        }
        if("spaceengineer.Vaisseau".equals(objet.getClass().getName())){
            leJeu().mourir();
        }
    }
    public void retour(){
        deplacerXY(0,50);
        angle += 180;
    }
    
    @Override
    public void evoluer(long dt) {
        
        //si l'asteroide percute le bord gauche
        if(this.posGauche()<=50){
            retour();
        }
        
        
        //sinon s'il percute le bord droit
        else if(this.posDroite()>=this.leJeu().largeur()-2){
            retour();
        } 
        

        //déplacement après ou sans retour.
        this.deplacerDA(dt*0.3, angle);
    }

}
