package p6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p1.Ej1InvertidoTest;
import p2.Ej2NotaTest;
import p3.Ej3CITest;
import p4.Ej4CambioMonedaTest;
import p5.Ej5RoleTest;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        Ej1InvertidoTest.class,
        Ej2NotaTest.class,
        Ej3CITest.class,
        Ej4CambioMonedaTest.class,
        Ej5RoleTest.class
})
public class TestSuite {
}
