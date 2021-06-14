package com.softhouse.cardchecker.data;

public class ValidationResult {
  private final String cardNumber;
  private final String cardType;
  private final Boolean isValid;

  public ValidationResult(String cardNumber, String cardType, Boolean isValid) {
    this.cardNumber = cardNumber;
    this.cardType = cardType;
    this.isValid = isValid;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getCardType() {
    return cardType;
  }

  public Boolean getValid() {
    return isValid;
  }
}
