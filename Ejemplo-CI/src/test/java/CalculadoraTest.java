import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        Calculadora cal = new Calculadora();
       assertEquals(5, cal.sumar(3,2));
    }

    @Test
    void restar() {
        Calculadora cal = new Calculadora();
        assertEquals(1, cal.resta(3,2));
    }
}