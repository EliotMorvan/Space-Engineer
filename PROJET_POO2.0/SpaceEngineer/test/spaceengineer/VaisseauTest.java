/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceengineer;

import iut.Objet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SZ474011
 */
public class VaisseauTest {
    
    public VaisseauTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tirer method, of class Vaisseau.
     */
    @Test
    public void testTirer() {
        System.out.println("tirer");
        
        JeuSpaceEngineer jeutest = new JeuSpaceEngineer(5,5,"super");
        
        Vaisseau instance = null;
        //instance.tirer(jeutest);
        
        jeutest.ajouter(instance);
    }

    /**
     * Test of effetCollision method, of class Vaisseau.
     */
    @Test
    public void testEffetCollision() {
        System.out.println("effetCollision");
        Objet objet = null;
        Vaisseau instance = null;
        instance.effetCollision(objet);
        
    }

    /**
     * Test of evoluer method, of class Vaisseau.
     */
    @Test
    public void testEvoluer() {
        System.out.println("evoluer");
        long l = 0L;
        Vaisseau instance = null;
        instance.evoluer(l);
        
    }
    
}
