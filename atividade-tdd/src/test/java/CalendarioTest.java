import br.com.Calendario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalendarioTest {

    private final Calendario cal = new Calendario();

    @Test
    void testSemParametros() {
        String resultado = cal.getCalendario();
        assertTrue(resultado.startsWith("Calendario do mes"));
    }

    @Test
    void testUmParametroAnoAntesReforma() {
        String resultado = cal.getCalendario("1500");
        assertEquals("Calendario do ano 1500", resultado);
    }

    @Test
    void testUmParametroAnoAposReforma() {
        String resultado = cal.getCalendario("2025");
        assertEquals("Calendario do ano 2025", resultado);
    }

    @Test
    void testUmParametroAnoDaReforma() {
        String resultado = cal.getCalendario("1752");
        assertEquals("Calendario do ano 1752", resultado);
    }

    @Test
    void testDoisParametrosAntesReforma() {
        String resultado = cal.getCalendario("6", "1500");
        assertEquals("Calendario do mes 6/1500", resultado);
    }

    @Test
    void testDoisParametrosAposReforma() {
        String resultado = cal.getCalendario("3", "2025");
        assertEquals("Calendario do mes 3/2025", resultado);
    }

    @Test
    void testSetembro1752() {
        String resultado = cal.getCalendario("9", "1752");
        assertTrue(resultado.contains("Reforma Gregoriana"));
    }

    @Test
    void testMaisDeDoisParametros() {
        String resultado = cal.getCalendario("5", "2024", "10", "abc");
        assertEquals("Calendario do mes 5/2024", resultado);
    }

    @Test
    void testAnoMenorQueUm() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("0"));
    }

    @Test
    void testAnoNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("-5"));
    }

    @Test
    void testAnoMaiorQue9999() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("10000"));
    }

    @Test
    void testAnoNaoNumerico() {
        assertThrows(IllegalArgumentException.class, () -> cal.getCalendario("abc"));
    }

    @Test
    void testAnoNaoInteiro() {
        assertThrows(IllegalArgumentException.class, () -> cal.getCalendario("2025.5"));
    }

    @Test
    void testMesMenorQueUm() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("0", "2025"));
    }

    @Test
    void testMesMaiorQue12() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("13", "2025"));
    }

    @Test
    void testMesNaoNumerico() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("xyz", "2025"));
    }

    @Test
    void testMesNaoInteiro() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.getCalendario("6.7", "2025"));
    }
}
