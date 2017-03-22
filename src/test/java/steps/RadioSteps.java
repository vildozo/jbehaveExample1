package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import core.Radio;


public class RadioSteps {
	  private Radio radio;

	    @Given("a digital radio")
	    public void aDigitalRadio(){
	        radio = new Radio();
	    }

	    @When("I turn on the radio")
	    public void iTurnOnTheRadio(){
	        radio.switchOnOff();
	    }

	    @Then("the radio should be turned on")
	    public void theRadioShouldBeTurnedOn(){
	        Assert.assertTrue(radio.isTurnedOn());
	    }
}
