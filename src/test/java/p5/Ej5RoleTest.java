package p5;

import filaA.p5.Login;
import filaA.p5.Util2Static;
import filaA.p5.UtilStatic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UtilStatic.class, Util2Static.class})
public class Ej5RoleTest {

    @Test
    public void verify_role(){
        PowerMockito.mockStatic(UtilStatic.class);
        PowerMockito.mockStatic(Util2Static.class);

        Mockito.when(UtilStatic.getPermision("admin", "password")).thenReturn("CRUD");
        Mockito.when(Util2Static.isUserValid("admin", "password")).thenReturn(true);

        Login login = new Login();
        String expected = "PERMISSION ROLE CRUD";
        String actual = login.roleUser("admin","password");

        Assert.assertEquals("Error, no es lo esperado", expected, actual);
    }
}
