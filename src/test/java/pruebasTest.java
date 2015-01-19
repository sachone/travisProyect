/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author al037542
 */
public class pruebasTest {
    
    public pruebasTest() {
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
     * Test of multiplicacion method, of class pruebas.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        Integer numero1 = 5;
        Integer numero2 = 5;
        pruebas instance = new pruebas();
        Integer expResult = 25;
        Integer result = instance.multiplicacion(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
