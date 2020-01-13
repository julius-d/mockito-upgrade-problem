package com.example.mockitoupgradeproblem.a;

import static org.junit.Assert.assertEquals;

import com.example.mockitoupgradeproblem.MyObject;
import java.util.stream.IntStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATest {

  @Mock
  private MyObject myObject;

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
