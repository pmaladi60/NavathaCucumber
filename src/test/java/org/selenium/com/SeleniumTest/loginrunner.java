package org.selenium.com.SeleniumTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,monochrome = true,features="resources/Login.feature", glue="org.selenium.com.SeleniumTest")
public class loginrunner{
	
}