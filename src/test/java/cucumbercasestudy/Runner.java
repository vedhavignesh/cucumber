package cucumbercasestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Cucumberfeaturefile/orderdeclined.feature"
,glue="cucumbercasestudy",
plugin="html:target/htmlreport")


public class Runner {

}
