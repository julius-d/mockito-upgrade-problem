package com.example.mockitoupgradeproblem.a;

import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;
import org.junit.Test;

public class A4WithoutMockitoTest {

  @Test
  public void name() {
    IntStream.range(0,  Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name2() {
    IntStream.range(0,  Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }
}
