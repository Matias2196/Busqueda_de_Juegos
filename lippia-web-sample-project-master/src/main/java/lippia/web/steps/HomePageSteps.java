package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PracticeAutomationTestingHomeService;

public class PracticeAutomationTestingActionsSteps extends PageSteps {

    @Given("The client is in practice automationtesting page")
    public void page() {
        PracticeAutomationTestingHomeService.navegarWeb();
    }

    @When("The client click on the Shop Menu")
    public void shop() {
        PracticeAutomationTestingHomeService.enterShop();
    }

    @And("The client go back Home Menu")
    public void home() {
        PracticeAutomationTestingHomeService.enterHome();
    }

    @Then("The client see only 3 sliders")
    public void slider() {
        PracticeAutomationTestingHomeService.scrollSliders();
    }

}
