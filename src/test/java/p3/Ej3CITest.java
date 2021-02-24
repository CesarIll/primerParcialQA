package p3;

import filaA.p3.Ej3Utils;
import org.junit.Assert;
import org.junit.Test;

public class Ej3CITest {

    Ej3Utils utils = new Ej3Utils();

    @Test(expected = Exception.class)
    public void test_1() throws Exception {
        utils.isCorrectCI("");
    }

    @Test(expected = NumberFormatException.class)
    public void test_2() throws Exception {
        utils.isCorrectCI("NAN");
    }

    @Test(timeout = 2000)
    public void test_3() throws Exception {
        boolean expected = true;
        boolean actual = utils.isCorrectCI("2203944");
        Assert.assertEquals("No es un CI correcto", expected, actual);
    }
}
