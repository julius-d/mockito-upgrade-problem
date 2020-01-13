package com.example.mockitoupgradeproblem.a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AWithoutMockitoTest {

  @Test
  public void name() {
    assertEquals("hi", "hi");
  }

  @Test
  public void name2() {
    assertEquals("hi", "hi");
  }
}
