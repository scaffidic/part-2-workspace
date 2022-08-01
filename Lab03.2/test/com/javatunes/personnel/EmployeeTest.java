package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Objects;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

//  private Employee employee;


  @Before
  public void setUp() throws Exception {
    Employee x = new SalariedEmployee("Christian Scaffidi", new Date(0));
    Employee y = new SalariedEmployee("Christian Scaffidi", new Date(0));
  }

//  public void testEquals() {
//    assertTrue(new SalariedEmployee("Christian Scaffidi",new Date(0).equals(new SalariedEmployee("Christian Scaffidi", new Date(0)))));
//  }

  @Test
  public void testHashCode() {
  }
}