package ty.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/ty/features/Get_operation.feature",
glue="ty.step.definations")
public class runner {

}
