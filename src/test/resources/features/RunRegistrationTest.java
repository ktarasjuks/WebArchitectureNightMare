package lv.neotech.tapost.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This file should not be used. cucumber-jvm-parallel-plugin is used by default in pom.xml
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber/all", "json:target/cucumber/cucumber-all.json"},
        features = {"src/test/resources/features/"},
        tags = {"@registration"},
        glue = {"lv.neotech.tapost.stepdefs", "lv.neotech.tapost.hooks"}
)
public class RunRegistrationTest {

}
