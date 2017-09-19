/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceengineer;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author em179727
 */

public class Vaisseau extends ObjetTouchable implements KeyListener{
   
    public Vaisseau(Jeu g, String nom, int x, int y) {
        super(g, "vaisseau", x, y);
    }
    
    public boolean estMort(){
        boolean res = false;
        return res;
    }
    
    //le vaisseau tire un objet de type "Projectile"
    public void tirer(Jeu g){
        
        //on récupère la position verticale du vaisseau pour la création du projectile
        int x = this.milieuX();
        Projectile pro = new Projectile(g, "missile", x, 750);
        leJeu().ajouter(pro);
    }

    @Override
    public void effetCollision(Objet o) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
                if(this.posGauche()>0)
                    this.deplacerXY(-15, 0);
                break;
            case KeyEvent.VK_RIGHT:
                if(this.posDroite()<this.leJeu().largeur())
                    this.deplacerXY(+15, 0);
                break; 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            tirer(leJeu());
        }
    }

    @Override
    public void evoluer(long l) {
        
    }

}
