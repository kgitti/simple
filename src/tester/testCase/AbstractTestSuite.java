package testCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { AbstractTestCase.class })
public abstract class AbstractTestSuite {
	public static void debug(){
		AbstractTestCase.setDebug(true);
	}
}
