package p1;

import filaA.p1.Ej1UtilsNumeros;
import org.junit.*;

public class Ej1InvertidoTest {

    Ej1UtilsNumeros utilsNumeros;

    @BeforeClass
    public static void beforeClaseTestInvertido(){
        System.out.println("Entrando a pruebas Invertidos");
    }

    @Before
    public void beforeInvertido(){
        utilsNumeros = new Ej1UtilsNumeros();
    }

    @Test
    public void test_1(){
        int numero = 2345;
        int expected = 5432;
        int actual = utilsNumeros.invertirNumero(numero);
        Assert.assertEquals("Error, no es el invertido", expected, actual);
    }

    @Test
    public void test_2(){
        int numero = 574634;
        int expected = 436475;
        int actual = utilsNumeros.invertirNumero(numero);
        Assert.assertEquals("Error, no es el invertido", expected, actual);
    }

    @Test
    public void test_3(){
        int numero = 934576;
        int expected = 675439;
        int actual = utilsNumeros.invertirNumero(numero);
        Assert.assertEquals("Error, no es el invertido", expected, actual);
    }

    @After
    public void afterInvertido(){
        utilsNumeros = null;
    }

    @AfterClass
    public static void afterClassInvertido(){
        System.out.println("Saliendo de pruebas Invertidos");
    }
}
