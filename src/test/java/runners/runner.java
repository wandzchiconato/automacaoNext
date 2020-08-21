package runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        plugin   = {"pretty"},
        features = {"src/test/resources"},
        glue     = {"steps"}
)
public class runner {

}