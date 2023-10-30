package org.testrunnerlist;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFilesList",
glue="org.adactinstepdefinition",dryRun=false,tags={"@sanitary"})


public class TestRunner {

}
