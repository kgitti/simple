package helloworld;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import helloworld.HelloTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses( { HelloTestCase.class })
public class HelloworldTestSuite {
	public static void debug(){
		HelloTestCase.setDebug(true);
	}
}
