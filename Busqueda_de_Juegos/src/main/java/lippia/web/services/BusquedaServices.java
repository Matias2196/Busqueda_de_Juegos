package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.BusquedaConstants;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class BusquedaServices extends ActionManager {

    public static void navegadorWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void busqueda(String text) {
        setInput(BusquedaConstants.BUSQUEDA, text + Keys.ENTER);
    }
    public static void resultados(String juego){
        Assert.assertTrue(WebActionManager.isPresent(String.format(BusquedaConstants.RESULTADO_FORMAT,juego)));
    }

}
