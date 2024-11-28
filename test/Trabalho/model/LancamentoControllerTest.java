/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Trabalho.model;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabi Sofiati Rausch
 */
public class LancamentoControllerTest {
    
    public LancamentoControllerTest() {
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
     * Teste para ver se o lançamento nulo causa IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInserirLancamentoNulo() {
        System.out.println("inserirLancamento");
        Lancamento lancamento = null;
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(lancamento);
    }

    /**
     * Teste para ver se remover um lançamento nulo causa IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoverLancamentoNulo() {
        System.out.println("inserirLancamento");
        Lancamento lancamento = null;
        LancamentoController controller = new LancamentoController();
        controller.removerLancamento(lancamento);
    }

    /**
     * Test of getLancamentos method, of class LancamentoController.
     */
    @Test
    public void testGetLancamentos() {
        System.out.println("getLancamentos");
        LancamentoController instance = new LancamentoController();
        ArrayList<Lancamento> expResult = null;
        ArrayList<Lancamento> result = instance.getLancamentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarLancamentos method, of class LancamentoController.
     */
    @Test
    public void testCarregarLancamentos() {
        System.out.println("carregarLancamentos");
        LancamentoController instance = new LancamentoController();
        instance.carregarLancamentos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarLancamentos method, of class LancamentoController.
     */
    @Test
    public void testSalvarLancamentos() {
        System.out.println("salvarLancamentos");
        LancamentoController instance = new LancamentoController();
        instance.salvarLancamentos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incluirCategoria method, of class LancamentoController.
     */
    @Test
    public void testIncluirCategoria() {
        System.out.println("incluirCategoria");
        Categoria categoria = null;
        LancamentoController instance = new LancamentoController();
        instance.incluirCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCategoria method, of class LancamentoController.
     */
    @Test
    public void testRemoverCategoria() {
        System.out.println("removerCategoria");
        Categoria categoria = null;
        LancamentoController instance = new LancamentoController();
        instance.removerCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class LancamentoController.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        LancamentoController instance = new LancamentoController();
        ArrayList<Categoria> expResult = null;
        ArrayList<Categoria> result = instance.getCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarCategorias method, of class LancamentoController.
     */
    @Test
    public void testCarregarCategorias() {
        System.out.println("carregarCategorias");
        LancamentoController instance = new LancamentoController();
        instance.carregarCategorias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarCategorias method, of class LancamentoController.
     */
    @Test
    public void testSalvarCategorias() {
        System.out.println("salvarCategorias");
        LancamentoController instance = new LancamentoController();
        instance.salvarCategorias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiretorioSalvamento method, of class LancamentoController.
     */
    @Test
    public void testGetDiretorioSalvamento() {
        System.out.println("getDiretorioSalvamento");
        LancamentoController instance = new LancamentoController();
        String expResult = "";
        String result = instance.getDiretorioSalvamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiretorioSalvamento method, of class LancamentoController.
     */
    @Test
    public void testSetDiretorioSalvamento() {
        System.out.println("setDiretorioSalvamento");
        String diretorioSalvamento = "";
        LancamentoController instance = new LancamentoController();
        instance.setDiretorioSalvamento(diretorioSalvamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarDiretorioSalvamento method, of class LancamentoController.
     */
    @Test
    public void testCarregarDiretorioSalvamento() {
        System.out.println("carregarDiretorioSalvamento");
        LancamentoController instance = new LancamentoController();
        instance.carregarDiretorioSalvamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarDiretorioSalvamento method, of class LancamentoController.
     */
    @Test
    public void testSalvarDiretorioSalvamento() {
        System.out.println("salvarDiretorioSalvamento");
        LancamentoController instance = new LancamentoController();
        instance.salvarDiretorioSalvamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSaldo method, of class LancamentoController.
     */
    @Test
    public void testCalcularSaldo() {
        System.out.println("calcularSaldo");
        LocalDate desde = null;
        LocalDate ate = null;
        LancamentoController instance = new LancamentoController();
        double expResult = 0.0;
        double result = instance.calcularSaldo(desde, ate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
