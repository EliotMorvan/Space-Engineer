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
public class Projectile extends ObjetTouchable {
    
    //Jeu actuel
    private final JeuSpaceEngineer spaceEngineer;
  
    
    public Projectile(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        
        //g est forcé en JeuSpaceEngineer afin d'y modifier les attributs qui s'y trouvent.
        //Par précaution, LeJeu() est appelé pour toute autre manipulation ne nécessitant pas l'appels des attributs de g.
        spaceEngineer = (JeuSpaceEngineer)g;
    }

    @Override
    public void effetCollision(Objet objet) {
        
        //effet de la colision avec l'objet de type Bloc
        if("spaceengineer.Bloc".equals(objet.getClass().getName())){
        
        //création d'une instance de bloc identique au paramètre.
        //Etant sûr de la classe de objet en parametre, on le force de type bloc pour les instruction suivantes
        Bloc modif = (Bloc) objet;
        
        //on crée un int correspondant au degré d'usure du bloc en paramètre
        int degreUsure;
        degreUsure = modif.getab();
        
        //premiere collision: le sprite du bloc est changé et l'objet percutant est détruit.
        if(degreUsure == 0){
        objet.changeSprite("bloc2");
        leJeu().supprimer(this);
        
        //deuxième collision: même procédure que précédement.
        //    ^     La valeur est de 3 car le test de collision n'est pas précis et le projectile,
        //  / ! \   bien que théoriquement détruit, continue d'avancer et de percuter le bloc.
        // _______  Cette marge permet au bloc ne pas se détruire immédiatement.
        }else if(degreUsure == 3){
        objet.changeSprite("bloc3");
        leJeu().supprimer(this);
        
        //Même barratin que précédement..
        //Lors de cette troisième collision, le bloc est également détruit.
        }else if(degreUsure == 5){
        leJeu().supprimer(this);
        leJeu().supprimer(objet);
        }
        
        //le dégre d'usure est incrémenté à chque collision.
        modif.setab(degreUsure + 1);
        
        //Si l'objet n'est pas un bloc, toute collision avec le projctile
        //entraine la destruction des deux instances.
        }  else if (!"spaceengineer.Background".equals(objet.getClass().getName())){
        leJeu().supprimer(this);
        leJeu().supprimer(objet);
        spaceEngineer.retirerEnem(objet);
      
           
        }
        
        
    }
 
    
    //Le projectile se déplace verticalement
    @Override
    public void evoluer(long dt) {
        this.deplacerDA(dt*0.7, 90);
    }

}
