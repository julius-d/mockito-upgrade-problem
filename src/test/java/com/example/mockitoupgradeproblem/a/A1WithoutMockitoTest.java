package com.example.mockitoupgradeproblem.a;

import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;
import org.junit.Test;

public class A1WithoutMockitoTest {

  @Test
  public void name() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name2() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name3() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name4() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name5() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }

  @Test
  public void name6() {
    IntStream.range(0, Integer.MAX_VALUE).boxed()
        .forEach(i -> assertEquals(i, i));
  }
}
