package testCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractTestCase {

	private static boolean debug=false;
	private static int callerIndex=2;
	
    @BeforeClass
    public static void startupSystem() {   
    	printOut("@BeforeClass - Startup");
    }
 
    @AfterClass
    public static void shutdownSystem() {
    	printOut("@AfterClass - Shutdown");
    }
 
    @Before
    public void ParpareCaseTest() {
        printOut("@Before - Parpare");
    }
 
    @After
    public void ClearCaseTest() {
        printOut("@After - Clear");
    }
    
    protected static void printOut(String msg){
    	if(debug){
    		StackTraceElement element = Thread.currentThread().getStackTrace()[callerIndex];
    		String caller = "["+element.getFileName()+":"+element.getClassName()+"."+element.getMethodName()+":"+element.getLineNumber()+"]";
    		System.out.println("DEBUG:"+caller+""+msg);
    	}
    }
	public static boolean isDebug() {
		return debug;
	}

	public static void setDebug(boolean debug) {
		AbstractTestCase.debug = debug;
	}
 
}
