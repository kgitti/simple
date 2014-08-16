package runner;

import helloworld.HelloworldTestSuite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void enabledDebug() {
      HelloworldTestSuite.debug();
   }
   public static void main(String[] args) {
      //TestRunner.enabledDebug();
      Result result = JUnitCore.runClasses(HelloworldTestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
} 
