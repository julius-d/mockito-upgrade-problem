package com.example.mockitoupgradeproblem.a;

import static org.junit.Assert.assertEquals;

import com.example.mockitoupgradeproblem.MyObject;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

@RunWith(MockitoJUnitRunner.class)
public class A1Test {

//  public @Rule MockitoRule mockito = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

  @Mock
  private MyObject myObject;

  @Test
  public void name() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      //
    }
  }
}
