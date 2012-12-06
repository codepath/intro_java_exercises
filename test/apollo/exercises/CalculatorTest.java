package apollo.exercises;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {


  @BeforeClass 
  public static void testSetup(){
    // Preparation of the unit tests
  }
  
  @AfterClass 
  public static void testCleanup(){
    // Teardown for data used by the unit tests
  }
  
  @Test
  public void testMultiply() {
    Calculator tester = new Calculator();
    assertEquals("Result", 50, tester.multiply(10, 5));
  }
  
  @Test
  public void testAdd() {
    Calculator tester = new Calculator();
    assertEquals("Result", 15, tester.add(10, 5));
  }

} 