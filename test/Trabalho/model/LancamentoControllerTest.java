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
     * Teste para calcular saldo com desde e até indefinido.
     */
    @Test
    public void testCalcularSaldoPeriodoIndefinido() {
        System.out.println("calcularSaldoPeriodoIndefinido");
        LancamentoController controller = new LancamentoController();
        //todos vão ser calculados
        controller.inserirLancamento(new Receita(500.0, LocalDate.of(2024, 1, 1), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 4, 16), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        controller.inserirLancamento(new Receita(1000.0, LocalDate.of(2024, 8, 8), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 11, 1), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        controller.inserirLancamento(new Receita(2000.0, LocalDate.of(2025, 2, 10), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(100.0, LocalDate.of(2025, 5, 15), new Categoria("Aluguel", TipoCategoria.DESPESA)));

        double saldo = controller.calcularSaldo(null, null);
        assertEquals(3000.0, saldo, 0.01);
    }
    /**
     * Teste para calcular saldo até indefinido.
     */
    @Test
    public void testCalcularSaldoAtéIndefinido() {
        System.out.println("calcularSaldoPeriodoIndefinido");
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(new Receita(500.0, LocalDate.of(2024, 1, 1), new Categoria("Investimento", TipoCategoria.RECEITA)));
        //o acima não vai ser calculado
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 4, 16), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        controller.inserirLancamento(new Receita(1000.0, LocalDate.of(2024, 8, 8), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 11, 1), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        controller.inserirLancamento(new Receita(2000.0, LocalDate.of(2025, 2, 10), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(100.0, LocalDate.of(2025, 5, 15), new Categoria("Aluguel", TipoCategoria.DESPESA)));


        double saldo = controller.calcularSaldo(LocalDate.of(2024, 4, 1), null);
        assertEquals(2500.0, saldo, 0.01);
    }
    /**
     * Teste para calcular saldo desde indefinido.
     */
    @Test
    public void testCalcularSaldoDesdeIndefinido() {
        System.out.println("calcularSaldoPeriodoIndefinido");
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(new Receita(500.0, LocalDate.of(2024, 1, 1), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 4, 16), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        controller.inserirLancamento(new Receita(1000.0, LocalDate.of(2024, 8, 8), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 11, 1), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        //os abaixo não vão ser calculados
        controller.inserirLancamento(new Receita(2000.0, LocalDate.of(2025, 2, 10), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(100.0, LocalDate.of(2025, 5, 15), new Categoria("Aluguel", TipoCategoria.DESPESA)));

        double saldo = controller.calcularSaldo(null, LocalDate.of(2025, 1, 31));
        assertEquals(1100.0, saldo, 0.01);
    }

    /**
     * Teste para calcular saldo com desde e até DEFINIDO.
     */
    @Test
    public void testCalcularSaldoPeriodoDefinido() {
        System.out.println("calcularSaldoPeriodoValido");
        LancamentoController controller = new LancamentoController();
        controller.inserirLancamento(new Receita(600.0, LocalDate.of(2023, 1, 31), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Receita(500.0, LocalDate.of(2024, 1, 1), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 4, 16), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        //os acima não vão ser calculados
        controller.inserirLancamento(new Receita(1000.0, LocalDate.of(2024, 8, 8), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(200.0, LocalDate.of(2024, 11, 1), new Categoria("Aluguel", TipoCategoria.DESPESA)));
        //os abaixo não vão ser calculados
        controller.inserirLancamento(new Receita(2000.0, LocalDate.of(2025, 2, 10), new Categoria("Investimento", TipoCategoria.RECEITA)));
        controller.inserirLancamento(new Despesa(100.0, LocalDate.of(2025, 5, 15), new Categoria("Aluguel", TipoCategoria.DESPESA)));

        double saldo = controller.calcularSaldo(LocalDate.of(2024, 5, 15), LocalDate.of(2024, 12, 31));
        assertEquals(800.0, saldo, 0.01);
    }


}
