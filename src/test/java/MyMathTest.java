import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public  void divideByZeroShouldThrowException(){
        MyMath.divide(2, 0);
    }
}
