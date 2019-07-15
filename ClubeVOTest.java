/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class ClubeVOTest {
    
    private static final ClubeVO C = new ClubeVO();
    
    public ClubeVOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        C.setNomeClube("Pogba");
        C.setLigaClube("Premier League");
        C.setRanking(1);
        C.setOrcamento(500);
        C.setTecnico("Mourin");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(C);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdClube method, of class ClubeVO.
     */
    @Test
    public void testGetIdClube() {
    }

    /**
     * Test of setIdClube method, of class ClubeVO.
     */
    @Test
    public void testSetIdClube() {
    }

    /**
     * Test of getNomeClube method, of class ClubeVO.
     */
    @Test
    public void testGetNomeClube() {
    }

    /**
     * Test of setNomeClube method, of class ClubeVO.
     */
    @Test
    public void testSetNomeClube() {
    }

    /**
     * Test of getLigaClube method, of class ClubeVO.
     */
    @Test
    public void testGetLigaClube() {
    }

    /**
     * Test of setLigaClube method, of class ClubeVO.
     */
    @Test
    public void testSetLigaClube() {
    }

    /**
     * Test of getRanking method, of class ClubeVO.
     */
    @Test
    public void testGetRanking() {
    }

    /**
     * Test of setRanking method, of class ClubeVO.
     */
    @Test
    public void testSetRanking() {
    }

    /**
     * Test of getOrcamento method, of class ClubeVO.
     */
    @Test
    public void testGetOrcamento() {
    }

    /**
     * Test of setOrcamento method, of class ClubeVO.
     */
    @Test
    public void testSetOrcamento() {
    }

    /**
     * Test of getTecnico method, of class ClubeVO.
     */
    @Test
    public void testGetTecnico() {
    }

    /**
     * Test of setTecnico method, of class ClubeVO.
     */
    @Test
    public void testSetTecnico() {
    }

    /**
     * Test of toString method, of class ClubeVO.
     */
    @Test
    public void testToString() {
    }
    
}
