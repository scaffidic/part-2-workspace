package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("Christian Scaffidi", new Date(0), 2000.0);

  }

  @Test
  public void pay() {
    assertEquals(2000.0, employee.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(2000 * TaxPayer.SALARIED_TAX_RATE, employee.payTaxes(), 0.005);
  }

  @Test
  public void equals_same() {
    Employee employee2 = new SalariedEmployee("Christian Scaffidi", new Date(0), 2000.0);
    assertTrue(employee.equals(employee2));
    assertTrue(employee2.equals(employee));
  }

  @Test
  public void equals_different() {
    Employee employee2 = new SalariedEmployee("Jane Smith", new Date(0), 2000.0);
    assertFalse(employee.equals(employee2));
    //SalariedEmp equals is being invoked, not Employee
  }


  @Test
  public void hashCode_same() {
    Employee employee2 = new SalariedEmployee("Jane Smith", new Date(0), 2000.0);
    assertEquals(employee.hashCode(), employee2.hashCode());
  }


  @Test
  public void hashCode_different() {
    Employee employee2 = new SalariedEmployee("Jane Smith", new Date(1), 2000.0);
    assertNotEquals(employee.hashCode(), employee2.hashCode());
  }
}