package com.softhouse.cardchecker.utility;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CardCheckerTest {
  @Test
  public void testChecker() {
    CardChecker cardChecker = CardChecker.getInstance();
    String validationResult = cardChecker.checkCardNumber("4111111111111111").toString();
    Assert.assertEquals("VISA: 4111111111111111 (valid)", validationResult);
    validationResult = cardChecker.checkCardNumber("4012888888881881").toString();
    Assert.assertEquals("VISA: 4012888888881881 (valid)", validationResult);
    validationResult = cardChecker.checkCardNumber("378282246310005").toString();
    Assert.assertEquals("AMEX: 378282246310005 (valid)", validationResult);
    validationResult = cardChecker.checkCardNumber("6011111111111117").toString();
    Assert.assertEquals("Discover: 6011111111111117 (valid)", validationResult);
    validationResult = cardChecker.checkCardNumber("5105105 105105 100").toString();
    Assert.assertEquals("MasterCard: 5105105 105105 100 (valid)", validationResult);
    validationResult = cardChecker.checkCardNumber("5105 1051 0510 5106").toString();
    Assert.assertEquals("MasterCard: 5105 1051 0510 5106 (invalid)", validationResult);
    validationResult = cardChecker.checkCardNumber("9111111111111111").toString();
    Assert.assertEquals("Unknown: 9111111111111111 (invalid)", validationResult);
  }
}
