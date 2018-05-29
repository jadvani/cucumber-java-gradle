/***
Created by Javier Advani
on May 29, 2018
***/
package es.wata.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources")
public class CukesRunner {

}
