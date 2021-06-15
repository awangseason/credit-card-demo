package com.softhouse.cardchecker.utility;

import com.softhouse.cardchecker.data.CreditCard;
import com.softhouse.cardchecker.data.ValidationResult;

public class CardChecker {

  private static final CardChecker instance = new CardChecker();
  private final CreditCard[] creditCardTypes = new CreditCard[]{ CreditCard.AMEX, CreditCard.Discover, CreditCard.MasterCard, CreditCard.VISA};

  private CardChecker() {
  }

  public static CardChecker getInstance() {
    return instance;
  }

  public ValidationResult checkCardNumber(String cardNumber) {
    String formattedNumber = Algorithm.formatCardNumber(cardNumber);
    boolean isValid = Algorithm.isGeneratedByLuhnAlgorithm(formattedNumber);
    boolean isCardType = false;
    String currentCardType = "";
    for(int i = 0; i < creditCardTypes.length && !isCardType; i ++) {
      isCardType = creditCardTypes[i].isThisType(formattedNumber);
      currentCardType = creditCardTypes[i].getCardTypeName();
    }
    if(!isCardType) {
      currentCardType = CreditCard.UNKNOWN_TYPE;
    }
    return new ValidationResult(cardNumber, currentCardType, isValid);
  }
}
