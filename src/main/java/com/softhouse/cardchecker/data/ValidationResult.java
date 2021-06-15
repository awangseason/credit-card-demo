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

  @Override
  public String toString() {
    return cardType + ": " + cardNumber + " (" + (isValid ? "valid" : "invalid") + ')';
  }
}
