package android.cucumber.appium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report",
		"json:target/test-report.json", "junit:target/test-report.xml" })
public class RunCukesTest {
}
