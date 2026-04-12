import br.com.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    public void deveValidarSenhaCorreta() {
        assertTrue(validator.isValid("SeNh@1234"));
    }

    @Test
    public void deveRejeitarSenhaComMenosDe8Caracteres() {
        assertFalse(validator.isValid("Senh@12"));
    }

    @Test
    public void deveRejeitarSenhaSemLetraMaiuscula() {
        assertFalse(validator.isValid("senh@1234"));
    }

    @Test
    public void deveRejeitarSenhaSemLetraMinuscula() {
        assertFalse(validator.isValid("SENH@1234"));
    }

    @Test
    public void deveRejeitarSenhaSemNumero() {
        assertFalse(validator.isValid("SeNh@abcd"));
    }

    @Test
    public void deveRejeitarSenhaSemCaractereEspecial() {
        assertFalse(validator.isValid("SeNha1234"));
    }

    @Test
    public void deveRejeitarSenhaComEspacoEmBranco() {
        assertFalse(validator.isValid("SeNh@ 123"));
    }

    @Test
    public void deveRejeitarSenhaNula() {
        assertFalse(validator.isValid(null));
    }
}