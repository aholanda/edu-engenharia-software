import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteCalculadora {
    Calculadora calc = new Calculadora();

    @Test
    public void testeSoma() {
	int esperado = 7;
	int res = calc.somar(3, 4);
	assertEquals("somando 3 + 4", esperado, res);
    }

    @Test
    public void testeDivisao() {
	int esperado = 4;
	int res = calc.dividir(8, 2);
	assertEquals("dividindo 8 / 2", esperado, res);
    }
}
