package p2;

import filaA.p2.Ej2Notas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Ej2NotaTest {

    private int nota;
    private String result;
    private Ej2Notas calculador = new Ej2Notas();

    public Ej2NotaTest(int nota, String result){
        this.nota = nota;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-1  , "VALOR INCORRECTO"});
        objects.add(new Object[]{0   , "REGULAR"});
        objects.add(new Object[]{1   , "REGULAR"});
        objects.add(new Object[]{34  , "REGULAR"});
        objects.add(new Object[]{35  , "REGULAR"});
        objects.add(new Object[]{36  , "REGULAR"});
        objects.add(new Object[]{69  , "REGULAR"});
        objects.add(new Object[]{70  , "REGULAR"});
        objects.add(new Object[]{71  , "BUENO"});
        objects.add(new Object[]{74  , "BUENO"});
        objects.add(new Object[]{75  , "BUENO"});
        objects.add(new Object[]{76  , "BUENO"});
        objects.add(new Object[]{79  , "BUENO"});
        objects.add(new Object[]{80  , "BUENO"});
        objects.add(new Object[]{81  , "MUY BUENO"});
        objects.add(new Object[]{84  , "MUY BUENO"});
        objects.add(new Object[]{85  , "MUY BUENO"});
        objects.add(new Object[]{86  , "MUY BUENO"});
        objects.add(new Object[]{89  , "MUY BUENO"});
        objects.add(new Object[]{90  , "MUY BUENO"});
        objects.add(new Object[]{91  , "EXCELENTE"});
        objects.add(new Object[]{94  , "EXCELENTE"});
        objects.add(new Object[]{95  , "EXCELENTE"});
        objects.add(new Object[]{96  , "EXCELENTE"});
        objects.add(new Object[]{99  , "EXCELENTE"});
        objects.add(new Object[]{100 , "EXCELENTE"});
        objects.add(new Object[]{101 , "VALOR INCORRECTO"});


        return objects;
    }

    @Test
    public void notaTest(){
        String expected = this.result;
        String actual = this.calculador.notasCualitativas(nota);
        Assert.assertEquals("Error, no es la mismo", expected, actual);
    }
}
