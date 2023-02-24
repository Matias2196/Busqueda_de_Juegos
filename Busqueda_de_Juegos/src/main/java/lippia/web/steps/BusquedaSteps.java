package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.BusquedaServices;

public class BusquedaSteps extends PageSteps {

    @Given("Como usuario estoy en la main page de google")
    public void navegador() {
        BusquedaServices.navegadorWeb();
    }
    @When("^Como usuario busco referencia a (.*)$")
    public void busqueda(String juego) {
        BusquedaServices.busqueda(juego);
    }
    @Then("^El buscador muestra los siguentes resultados (.*)$")
    public void resultados(String juego) {
        BusquedaServices.resultados(juego);
    }

}
