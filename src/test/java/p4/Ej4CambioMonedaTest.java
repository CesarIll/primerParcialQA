package p4;

import filaA.p4.CambioMoneda;
import filaA.p4.Util;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class Ej4CambioMonedaTest {

    Util mock = Mockito.mock(Util.class);

    @Test
    public void verify_currency(){
        CambioMoneda cambioMoneda = new CambioMoneda(mock);

        Mockito.when(mock.obtenerTipoDeCambio("Dólares", "Bolivianos")).thenReturn(7);

        String expected = "La cantidad convertida fue : [700] Bolivianos";
        String actual = cambioMoneda.saveInNewMoney(100, "Dólares", "Bolivianos");

        Mockito.verify(mock).obtenerTipoDeCambio("Dólares", "Bolivianos");

        Assert.assertEquals("Error, no es el mismo mensaje", expected, actual);
    }
}
