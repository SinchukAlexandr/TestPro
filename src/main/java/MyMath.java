public class MyMath {

    public static int divide(int val1, int val2) {
        if (val2 == 0)
            throw new ArithmeticException("Divide by zero");
        return val1 / val2;
    }
}
