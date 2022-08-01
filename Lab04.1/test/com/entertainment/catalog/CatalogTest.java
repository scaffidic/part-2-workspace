/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {

  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void testFindByBrandNoMatches() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void testFindByBrandWithMatches() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertEquals(7, tvs.size());
    for (Television tv : tvs) {
      assertEquals("Sony", tv.getBrand());
    }
  }

  @Test
  public void testFindByBrandsWithMatches() {
    String[] brands = {"Sony", "Zenith"};
    Map<String, Collection<Television>> tvs = Catalog.findByBrands(brands);
    assertNotNull(tvs);
    for (Map.Entry<String, Collection<Television>> tv : tvs.entrySet()) {
      assertTrue(Arrays.asList(brands).contains(tv.getKey()));
    }
  }

  @Test
  public void testFindByBrandsWithNoMatches() {
    Map<String, Collection<Television>> tvs = Catalog.findByBrands("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }
}