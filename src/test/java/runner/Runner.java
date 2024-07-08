package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        plugin = {"pretty","summary",
                "html:target/.html",
                "json:target/.json",
                "junit:target/.xml",
                "timeline:target/cucumber-timeline"},
        features = "src/test/resources/features",
        tags = "@Test")
public class Runner {
        public Runner() {
        }
}