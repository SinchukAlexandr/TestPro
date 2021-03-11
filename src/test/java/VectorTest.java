import org.junit.Assert;
import org.junit.Test;

public class VectorTest {
    @Test
    public void shouldHaveZeroLength() {
        Vector vector = new Vector();

        Assert.assertEquals(0, vector.length(), 1e-9);

    }
    @Test
    public void shouldHaveZeroX(){
        Vector v1 = new Vector();

        Assert.assertEquals(0, v1.getX(), 1e-9);
    }
}
