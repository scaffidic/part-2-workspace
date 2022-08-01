package com.javatunes.personnel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifecycleTest {

  @Before
  public void beforeTest()  {
    System.out.println("beforeTest");
  }

  @After
  public void afterTest() {
    System.out.println("afterTest");
  }

  @BeforeClass
  public static void beforeTestRun()  {
    System.out.println("beforeTestRun");
  }

  @AfterClass
  public static void afterTestRun()  {
    System.out.println("afterTestRun");
  }

  @Test
  public void testSomething() {

  }

  @Test
  public void testSomethingElse() {

  }
}
