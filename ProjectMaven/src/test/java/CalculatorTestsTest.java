import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestsTest {
    Calculator calculator = new Calculator();

    @Test
    public void sum(){
        assertEquals(6, calculator.sum(1, 5));
    }
    @Test
    public void substr(){
        assertEquals(5, calculator.substr(7, 2));
    }
    @Test
    public void div(){
        assertEquals(4, calculator.dif(16, 4));
    }
    @Test
    public void mult(){
        assertEquals(9, calculator.mult(3, 3));
    }

}