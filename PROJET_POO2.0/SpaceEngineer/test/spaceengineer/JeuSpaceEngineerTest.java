/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceengineer;

import java.awt.Graphics;
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
public class JeuSpaceEngineerTest {
    
    public JeuSpaceEngineerTest() {
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
     * Test of creeObjets method, of class JeuSpaceEngineer.
     */
    @Test
    public void testCreeObjets() {
        System.out.println("creeObjets");
        JeuSpaceEngineer instance = null;
        instance.creeObjets();
        
    }

    /**
     * Test of dessinerArrierePlan method, of class JeuSpaceEngineer.
     */
    @Test
    public void testDessinerArrierePlan() {
        System.out.println("dessinerArrierePlan");
        Graphics grphcs = null;
        JeuSpaceEngineer instance = null;
        instance.dessinerArrierePlan(grphcs);
        
    }

    /**
     * Test of perdu method, of class JeuSpaceEngineer.
     */
    @Test
    public void testPerdu() {
        System.out.println("perdu");
        JeuSpaceEngineer instance = null;
        instance.perdu();
        
    }

    /**
     * Test of gagne method, of class JeuSpaceEngineer.
     */
    @Test
    public void testGagne() {
        System.out.println("gagne");
        JeuSpaceEngineer instance = null;
        instance.gagne();
        
    }

    /**
     * Test of aGagne method, of class JeuSpaceEngineer.
     */
    @Test
    public void testAGagne() {
        System.out.println("aGagne");
        JeuSpaceEngineer instance = null;
        boolean expResult = false;
        boolean result = instance.aGagne();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of aPerdu method, of class JeuSpaceEngineer.
     */
    @Test
    public void testAPerdu() {
        System.out.println("aPerdu");
        JeuSpaceEngineer instance = null;
        boolean expResult = false;
        boolean result = instance.aPerdu();
        assertEquals(expResult, result);
        
    }
    
}
