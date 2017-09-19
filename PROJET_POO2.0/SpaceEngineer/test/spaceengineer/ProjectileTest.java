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
public class ProjectileTest {
    
    public ProjectileTest() {
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
     * Test of effetCollision method, of class Projectile.
     */
    @Test
    public void testEffetCollision() {
        System.out.println("effetCollision");
        Objet objet = null;
        Projectile instance = null;
        instance.effetCollision(objet);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of evoluer method, of class Projectile.
     */
    @Test
    public void testEvoluer() {
        System.out.println("evoluer");
        long l = 0L;
        Projectile instance = null;
        instance.evoluer(l);
        // TODO review the generated test code and remove the default call to fail.
    }

    
}
