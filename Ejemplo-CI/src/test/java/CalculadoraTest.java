import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        Calculadora cal = new Calculadora();
       assertEquals(5, cal.sumar(3,2));
    }
}