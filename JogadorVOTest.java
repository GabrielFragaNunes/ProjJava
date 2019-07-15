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
 * @since 06/05/2019 - 16:46
 * @version 1.0 Groot
 */
public class JogadorVOTest {
    
    private static final JogadorVO J = new JogadorVO();
    
    public JogadorVOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        J.setNome("Pogba");
        J.setIdade(27);
        J.setValorPasse(500);
        J.setPosicao("MC");
        J.setClubeOrigem("Man United");
        J.setClubeAtual("Barcelona");
        J.setSalario(20);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(J);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdJogador method, of class JogadorVO.
     */
    @Test
    public void testGetIdJogador() {
    }

    /**
     * Test of setIdJogador method, of class JogadorVO.
     */
    @Test
    public void testSetIdJogador() {
    }

    /**
     * Test of getNome method, of class JogadorVO.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class JogadorVO.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getIdade method, of class JogadorVO.
     */
    @Test
    public void testGetIdade() {
    }

    /**
     * Test of setIdade method, of class JogadorVO.
     */
    @Test
    public void testSetIdade() {
    }

    /**
     * Test of getValorPasse method, of class JogadorVO.
     */
    @Test
    public void testGetValorPasse() {
    }

    /**
     * Test of setValorPasse method, of class JogadorVO.
     */
    @Test
    public void testSetValorPasse() {
    }

    /**
     * Test of getPosicao method, of class JogadorVO.
     */
    @Test
    public void testGetPosicao() {
    }

    /**
     * Test of setPosicao method, of class JogadorVO.
     */
    @Test
    public void testSetPosicao() {
    }

    /**
     * Test of getClubeOrigem method, of class JogadorVO.
     */
    @Test
    public void testGetClubeOrigem() {
    }

    /**
     * Test of setClubeOrigem method, of class JogadorVO.
     */
    @Test
    public void testSetClubeOrigem() {
    }

    /**
     * Test of getClubeAtual method, of class JogadorVO.
     */
    @Test
    public void testGetClubeAtual() {
    }

    /**
     * Test of setClubeAtual method, of class JogadorVO.
     */
    @Test
    public void testSetClubeAtual() {
    }

    @Test
    public void testCalcularSalarioAnual() {
        assertEquals(J.calcularSalarioAnual(),240,0.0 );
    }
    
    /**
     * Test of toString method, of class JogadorVO.
     */
    @Test
    public void testToString() {
    }
    
}
