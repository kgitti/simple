package helloworld;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testCase.AbstractTestSuite;

import helloworld.HelloTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses( { HelloTestCase.class })
public class HelloworldTestSuite extends AbstractTestSuite {
	public static void debug(){
		HelloTestCase.setDebug(true);
	}
}
