package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee employee;

  @Before
  public void setUp() throws Exception {

    employee = new HourlyEmployee("John Smith", new Date(0), 53.11, 40.0);

  }

  @Test
  public void pay() {
    assertEquals(2124.4, employee.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(2124.4 * TaxPayer.HOURLY_TAX_RATE, employee.payTaxes(), 0.005);
  }
}