package com.softhouse.cardchecker.data;

import org.junit.Assert;
import org.junit.Test;

import static com.softhouse.cardchecker.data.CreditCard.AMEX;
import static com.softhouse.cardchecker.data.CreditCard.Discover;
import static com.softhouse.cardchecker.data.CreditCard.MasterCard;
import static com.softhouse.cardchecker.data.CreditCard.Visa;

public class CreditCardTester {
  @Test
  public void testAMEX() {
    Assert.assertTrue("It should be a AMEX card number.", AMEX.isThisType("340000000000000"));
    Assert.assertTrue("It should be a AMEX card number.", AMEX.isThisType("370000000000780"));
    Assert.assertTrue("It should be a AMEX card number.", AMEX.isThisType("370550000000780"));
    Assert.assertFalse("It should not be a AMEX card number.", AMEX.isThisType("940000000000000"));
    Assert.assertFalse("It should not be a AMEX card number.", AMEX.isThisType("360000000000780"));
    Assert.assertFalse("It should not be a AMEX card number.", AMEX.isThisType("3705500000007808"));
    Assert.assertFalse("It should not be a AMEX card number.", AMEX.isThisType("37055000000078A"));
  }

  @Test
  public void testDiscover() {
    Assert.assertTrue("It should be a Discover card number.", Discover.isThisType("6011111111111117"));
    Assert.assertTrue("It should be a Discover card number.", Discover.isThisType("6011234234326667"));
    Assert.assertTrue("It should be a Discover card number.", Discover.isThisType("6011999999999999"));
    Assert.assertFalse("It should not be a Discover card number.", Discover.isThisType("6012111111111117"));
    Assert.assertFalse("It should not be a Discover card number.", Discover.isThisType("6111111111111117"));
    Assert.assertFalse("It should not be a Discover card number.", Discover.isThisType("60111111111111170"));
    Assert.assertFalse("It should not be a Discover card number.", Discover.isThisType("60111111111111A7"));
  }

  @Test
  public void testMasterCard() {
    Assert.assertTrue("It should be a MasterCard card number.", MasterCard.isThisType("5105105105105100"));
    Assert.assertTrue("It should be a MasterCard card number.", MasterCard.isThisType("5305105105166100"));
    Assert.assertTrue("It should be a MasterCard card number.", MasterCard.isThisType("5505166105105100"));
    Assert.assertFalse("It should not be a MasterCard card number.", MasterCard.isThisType("51051051051051007"));
    Assert.assertFalse("It should not be a MasterCard card number.", MasterCard.isThisType("5605166105105100"));
    Assert.assertFalse("It should not be a MasterCard card number.", MasterCard.isThisType("2205166105105100"));
  }

  @Test
  public void testVisa() {
    Assert.assertTrue("It should be a Visa card number.", Visa.isThisType("4111111111111111"));
    Assert.assertTrue("It should be a Visa card number.", Visa.isThisType("4111111111111"));
    Assert.assertTrue("It should be a Visa card number.", Visa.isThisType("4211111111111"));
    Assert.assertFalse("It should not be a Visa card number.", Visa.isThisType("42111111111111"));
    Assert.assertFalse("It should not be a Visa card number.", Visa.isThisType("5111111111111"));
    Assert.assertFalse("It should not be a Visa card number.", Visa.isThisType("7111111111111111"));
  }
}
