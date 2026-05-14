import br.com.IRPF;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IRPFTest {

    private final IRPF irpf = new IRPF();
    private static final double DELTA = 0.01;

    @Test
    void testFaixaIsenta() {
        double resultado = irpf.calcular(1500.00);
        assertEquals(0.00, resultado, DELTA);
    }

    @Test
    void testFaixa7Porcento() {
        double resultado = irpf.calcular(2400.00);
        assertEquals(37.20, resultado, DELTA);
    }

    @Test
    void testFaixa15Porcento() {
        double resultado = irpf.calcular(3000.00);
        assertEquals(95.20, resultado, DELTA);
    }

    @Test
    void testFaixa22Porcento() {
        double resultado = irpf.calcular(4200.00);
        assertEquals(308.87, resultado, DELTA);
    }

    @Test
    void testFaixa27Porcento() {
        double resultado = irpf.calcular(7000.00);
        assertEquals(1055.64, resultado, DELTA);
    }

    @Test
    void testRendaNegativa() {
        assertThrows(IllegalArgumentException.class,
                () -> irpf.calcular(-500.00));
    }

    @Test
    void testValorNaoNumerico() {
        assertThrows(IllegalArgumentException.class,
                () -> irpf.calcular("abc"));
    }
}
