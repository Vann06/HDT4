import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void testCalcularExpresionPostfix() {
        assertEquals(9, Calculadora.calcularExpresionPostfix("9"));
        assertEquals(14, Calculadora.calcularExpresionPostfix("4+10"));
    }

    @Test
    public void testInfixAPostfix() {
        assertEquals("23+", Calculadora.InfixAPostfix("1+3"));
        assertEquals("56+23+", Calculadora.InfixAPostfix("(5+6)(2+3)"));
    }
}
