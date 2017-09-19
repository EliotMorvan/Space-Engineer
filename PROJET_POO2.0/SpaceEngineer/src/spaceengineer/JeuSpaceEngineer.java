/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceengineer;

import iut.Jeu;
import iut.Objet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author em179727
 */
public class JeuSpaceEngineer extends Jeu{
            
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JeuSpaceEngineer TheGame = new JeuSpaceEngineer(1024,968,"Jeu Space Invader");
        TheGame.jouer();
    }

    public JeuSpaceEngineer(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
    }
    
    //l'attribut joueur permet de gérer la partie et les conditions de 
    //victoires, défaites.
    private Vaisseau joueur;
    
    //L'arrayList est la liste des ennemis générés,
    //elle permet de tester si le joueur a gagné ou non.
    private final ArrayList<Asteroide> listeEnem = new ArrayList<>();
    
    //création du menu
    //précède la création de toutes les instances.
    public void menu(){
        
    }
    
    //création de tous les objets
    @Override
    public void creeObjets() {
        
        //creation du vaisseau joueur
        joueur = new Vaisseau(this, "joueur", 450,800);
        this.ajouter(joueur);
        this.ajouteEcouteurClavier(joueur);
        
        //création des blocs
        Bloc b1 = new Bloc(this, "Bloc", 250,600);
        this.ajouter(b1);
        
        Bloc b2 = new Bloc(this, "Bloc", 450,600);
        this.ajouter(b2);
        
        Bloc b3 = new Bloc(this, "Bloc",650,600);
        this.ajouter(b3);
        Bloc b4 = new Bloc(this, "Bloc",850,600);
        this.ajouter(b4);
        Bloc b5 = new Bloc(this, "Bloc",50,600);
        this.ajouter(b5);
        
     
        //Création de tous les astéroides
        //chacun indentifiable par une lettre
////////////////////////////////////////////////////////////////////////////////
//              PREMIERE LIGNE                                                //
////////////////////////////////////////////////////////////////////////////////
/**/
            Asteroide u = new Asteroide(this, "Asteroide", 13,1);
/**/        this.ajouter(u);
/**/        listeEnem.add(u);
            Asteroide v = new Asteroide(this, "Asteroide", 113,1);
/**/        this.ajouter(v);
/**/        listeEnem.add(v);
             Asteroide w = new Asteroide(this, "Asteroide", 213,1);
/**/        this.ajouter(w);
/**/        listeEnem.add(w);
            Asteroide x = new Asteroide(this, "Asteroide", 313,1);
/**/        this.ajouter(x);
/**/        listeEnem.add(x);
/**/        Asteroide a = new Asteroide(this, "Asteroide", 413,1);
/**/        this.ajouter(a);
/**/        listeEnem.add(a);
/**/        
/**/        Asteroide b = new Asteroide(this, "Asteroide", 513,1);
/**/        this.ajouter(b);
/**/        listeEnem.add(b);
/**/        
/**/        Asteroide c = new Asteroide(this, "Asteroide", 613,1);
/**/        this.ajouter(c);
/**/        listeEnem.add(c);

            Asteroide q = new Asteroide(this, "Asteroide", 713,1);
/**/        this.ajouter(q);
/**/        listeEnem.add(q);
            Asteroide r = new Asteroide(this, "Asteroide", 813,1);
/**/        this.ajouter(r);
/**/        listeEnem.add(r);
/*            Asteroide s = new Asteroide(this, "Asteroide", 913,1);
/*     this.ajouter(s);
/*    listeEnem.add(s);*/
/**/        
////////////////////////////////////////////////////////////////////////////////
//              DEUXIEME LIGNE                                                //
////////////////////////////////////////////////////////////////////////////////
/**/
/**/        Asteroide d = new Asteroide(this, "Asteroide", 413,100);
/**/        this.ajouter(d);
/**/        listeEnem.add(d);
/**/        
/*            Asteroide e = new Asteroide(this, "Asteroide", 513,100);
            this.ajouter(e);
            listeEnem.add(e);*/
/**/        
/**/        Asteroide f = new Asteroide(this, "Asteroide", 613,100);
/**/        this.ajouter(f);
/**/        listeEnem.add(f);

            /*Asteroide aa = new Asteroide(this, "Asteroide", 313,100);
            this.ajouter(aa);
            listeEnem.add(aa);*/
            Asteroide bb = new Asteroide(this, "Asteroide", 213,100);
/**/        this.ajouter(bb);
/**/        listeEnem.add(bb);
            /*Asteroide cc = new Asteroide(this, "Asteroide", 113,100);
            this.ajouter(cc);
            listeEnem.add(cc);*/
            Asteroide dd = new Asteroide(this, "Asteroide", 013,100);
/**/        this.ajouter(dd);
/**/        listeEnem.add(dd);
            /*Asteroide ee = new Asteroide(this, "Asteroide", 713,100);
            this.ajouter(ee);
            listeEnem.add(ee);*/
            Asteroide ff = new Asteroide(this, "Asteroide", 813,100);
/**/        this.ajouter(ff);
/**/        listeEnem.add(ff);
/*Asteroide gg = new Asteroide(this, "Asteroide", 913,100);
this.ajouter(gg);
listeEnem.add(gg);*/
/**/
////////////////////////////////////////////////////////////////////////////////
//              TROISIEME LIGNE                                               //
////////////////////////////////////////////////////////////////////////////////
/**/        
/**/        Asteroide g = new Asteroide(this, "Asteroide", 413,200);
/**/        this.ajouter(g);
/**/        listeEnem.add(g);
/**/        
/**/        Asteroide h = new Asteroide(this, "Asteroide", 513,200);
/**/        this.ajouter(h);
/**/        listeEnem.add(h);
/**/        
/**/        Asteroide i = new Asteroide(this, "Asteroide", 613,200);
/**/        this.ajouter(i);
/**/        listeEnem.add(i);

            Asteroide aaa = new Asteroide(this, "Asteroide", 313,200);
/**/        this.ajouter(aaa);
/**/        listeEnem.add(aaa);
            Asteroide bbb = new Asteroide(this, "Asteroide", 213,200);
/**/        this.ajouter(bbb);
/**/        listeEnem.add(bbb);
            Asteroide ccc = new Asteroide(this, "Asteroide", 113,200);
/**/        this.ajouter(ccc);
/**/        listeEnem.add(ccc);
            Asteroide ddd = new Asteroide(this, "Asteroide", 013,200);
/**/        this.ajouter(ddd);
/**/        listeEnem.add(ddd);
            Asteroide eee = new Asteroide(this, "Asteroide", 713,200);
/**/        this.ajouter(eee);
/**/        listeEnem.add(eee);
            Asteroide fff = new Asteroide(this, "Asteroide", 813,200);
/**/        this.ajouter(fff);
/**/        listeEnem.add(fff);
/*            Asteroide ggg = new Asteroide(this, "Asteroide", 913,200);
/*        this.ajouter(ggg);
/*       listeEnem.add(ggg);*/
/**/
////////////////////////////////////////////////////////////////////////////////
//              QUATRIEME LIGNE                                               //
////////////////////////////////////////////////////////////////////////////////
/**/
/**/        Asteroide dD = new Asteroide(this, "Asteroide", 413,300);
/**/        this.ajouter(dD);
/**/        listeEnem.add(dD);
/**/        
/*           Asteroide e = new Asteroide(this, "Asteroide", 513,100);
            this.ajouter(e);
            listeEnem.add(e);*/
/**/        
/**/        Asteroide fFF = new Asteroide(this, "Asteroide", 613,300);
/**/        this.ajouter(fFF);
/**/        listeEnem.add(fFF);

            /*Asteroide aa = new Asteroide(this, "Asteroide", 313,100);
            this.ajouter(aa);
            listeEnem.add(aa);*/
            Asteroide bbBB = new Asteroide(this, "Asteroide", 213,300);
/**/        this.ajouter(bbBB);
/**/        listeEnem.add(bbBB);
            /*Asteroide cc = new Asteroide(this, "Asteroide", 113,400);
            this.ajouter(cc);
            listeEnem.add(cc);*/
            Asteroide ddDD = new Asteroide(this, "Asteroide", 013,300);
/**/        this.ajouter(ddDD);
/**/        listeEnem.add(ddDD);
            /*Asteroide ee = new Asteroide(this, "Asteroide", 713,400);
            this.ajouter(ee);
            listeEnem.add(ee);*/
            Asteroide ffFF = new Asteroide(this, "Asteroide", 813,300);
/**/        this.ajouter(ffFF);
/**/        listeEnem.add(ffFF);
            /*Asteroide gg = new Asteroide(this, "Asteroide", 913,100);
            this.ajouter(gg);
            listeEnem.add(gg);*/
/**/
////////////////////////////////////////////////////////////////////////////////
//              CINQUIEME LIGNE                                               //
////////////////////////////////////////////////////////////////////////////////
/**/        
/**/        Asteroide n = new Asteroide(this, "Asteroide", 413,400);
/**/        this.ajouter(n);
/**/        listeEnem.add(n);
/**/        
/**/        Asteroide o = new Asteroide(this, "Asteroide", 513,400);
/**/        this.ajouter(o);
/**/        listeEnem.add(o);
/**/        
/**/        Asteroide p = new Asteroide(this, "Asteroide", 613,400);
/**/        this.ajouter(p);
/**/        listeEnem.add(p);
/**/
////////////////////////////////////////////////////////////////////////////////
//              FIN                                                           //
////////////////////////////////////////////////////////////////////////////////
    }
    
    @Override
    protected void perdu() {
        JOptionPane.showMessageDialog(this, "Vous avez perdu");
    }

    @Override
    protected void gagne() {
        JOptionPane.showMessageDialog(this, "Tous les ennemis ont été abbatus!");
    }

    //Cette fonction permet de modifier la liste d'ennemis à tout moment depuis
    //les autres classes.
    public void retirerEnem(Objet o){
        listeEnem.remove(o);
    }
    
    //Le joueur a gagné lorsque la liste d'ennemis est vide
    @Override
    protected boolean aGagne() {
        return listeEnem.isEmpty();
    }

    @Override
    protected boolean aPerdu() {
        return joueur.estMort();
    }

    @Override
    protected void dessinerArrierePlan(Graphics g) {
        ///////////
        g.setColor(Color.WHITE);
        ///////////
        g.fillRect(0, 0, largeur(), hauteur());
    }
    
}