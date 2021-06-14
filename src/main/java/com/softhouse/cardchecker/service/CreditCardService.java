package com.softhouse.cardchecker.service;

import com.softhouse.cardchecker.data.ValidationResult;

public interface CreditCardService {

  public ValidationResult validateCreditCardNumber(String cardNumber);
}
