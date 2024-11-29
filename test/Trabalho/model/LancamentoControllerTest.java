/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Trabalho.model;

import java.io.IOException;
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
     * Teste para ver se remover um lançamento nulo causa
     * IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoverLancamentoNulo() {
        System.out.println("inserirLancamento");
        Lancamento lancamento = null;
        LancamentoController controller = new LancamentoController();
        controller.removerLancamento(lancamento);
    }

    /**
     * Teste para carregar lançamentos de um arquivo válido.
     */
    @Test
    public void testCarregarLancamentosArquivoValido() {
        System.out.println("carregarLancamentosArquivoValido");
        LancamentoController controller = new LancamentoController();
        controller.setDiretorioSalvamento("src/Trabalho/arquivos/");

        try {
            controller.carregarLancamentos();
            assertFalse("A lista de lançamentos não deve estar vazia", controller.getLancamentos().isEmpty());
        } catch (IOException e) {
            fail("Exceção inesperada ao carregar lançamentos: " + e.getMessage());
        }
    }

    /**
     * Teste para salvar lançamentos em um arquivo válido.
     */
    @Test
    public void testSalvarLancamentosArquivoValido() {
        System.out.println("salvarLancamentosArquivoValido");
        LancamentoController controller = new LancamentoController();
        controller.setDiretorioSalvamento("src/Trabalho/arquivos/");
        Receita receita = new Receita(200.0, LocalDate.now(), new Categoria("Bônus", TipoCategoria.RECEITA));
        controller.inserirLancamento(receita);

        try {
            controller.salvarLancamentos();
            assertTrue("Arquivo deve ser salvo sem erros", true);
        } catch (IOException e) {
            fail("Exceção inesperada ao salvar lançamentos: " + e.getMessage());
        }
    }

    /**
     * Teste para incluir uma categoria nula.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIncluirCategoriaNula() {
        System.out.println("incluirCategoriaNula");
        Categoria categoria = null;
        LancamentoController controller = new LancamentoController();
        controller.incluirCategoria(categoria);
    }

    /**
     * Teste para remover uma categoria nula.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoverCategoriaNula() {
        System.out.println("removerCategoriaNula");
        Categoria categoria = null;
        LancamentoController controller = new LancamentoController();
        controller.removerCategoria(categoria);
    }

    /**
     * Teste para calcular saldo com período indefinido.
     */
    @Test
    public void testCalcularSaldoPeriodoIndefinido() {
        System.out.println("calcularSaldoPeriodoIndefinido");
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(new Receita(500.0, LocalDate.now(), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.now(), new Categoria("Aluguel", TipoCategoria.DESPESA)));

        double saldo = controller.calcularSaldo(null, null);
        assertEquals(300.0, saldo, 0.01);
    }

    /**
     * Teste para calcular saldo em período válido.
     */
    @Test
    public void testCalcularSaldoPeriodoValido() {
        System.out.println("calcularSaldoPeriodoValido");
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(new Receita(500.0, LocalDate.of(2024, 1, 1), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 1, 10), new Categoria("Aluguel", TipoCategoria.DESPESA)));

        double saldo = controller.calcularSaldo(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));
        assertEquals(300.0, saldo, 0.01);
    }

}
