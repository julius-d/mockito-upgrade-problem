package com.example.mockitoupgradeproblem.b;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BWithoutMockitoTest {

  @Test
  public void name() {
    assertEquals("hi", "hi");
  }

  @Test
  public void name2() {
    assertEquals("hi", "hi");
  }
}
