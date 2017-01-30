package qnet.uae.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
<<<<<<< HEAD
@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },features="src/test/resources/features/",glue="com.steps",tags="@Reg1")
=======
@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },features="src/test/resources/features/",glue="com.steps",tags="@test")
>>>>>>> branch 'Pavithri' of https://github.com/VikasGroup/UAE-Test-NS4S.git

public class TestRunner {

}
