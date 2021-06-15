package com.softhouse.cardchecker.utility;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AlgorithmTest {

  @Test
  public void testLuhnAlgorithm() {
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("4111111111111111"));
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("4012888888881881"));
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("378282246310005"));
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("6011111111111117"));

    Assert.assertFalse("This number should be invalid.", Algorithm.isGeneratedByLuhnAlgorithm("9111111111111111"));
    Assert.assertFalse("This number should be invalid.", Algorithm.isGeneratedByLuhnAlgorithm("4111111111111"));
  }

  @Test
  public void testLuhnAlgorithmWithSpecialChar() {
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("5105105 105105 100"));
    Assert.assertTrue("This number should be valid.", Algorithm.isGeneratedByLuhnAlgorithm("4408 0412 3456 7893"));

    Assert.assertFalse("This number should be invalid.", Algorithm.isGeneratedByLuhnAlgorithm("5105 1051 0510 5106"));
    Assert.assertFalse("This number should be invalid.", Algorithm.isGeneratedByLuhnAlgorithm("6A11111111111117"));
    Assert.assertFalse("This number should be invalid.", Algorithm.isGeneratedByLuhnAlgorithm("6-11111111111117"));
  }
}
