package com.softhouse.cardchecker.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Algorithm {
  private static final Logger logger = LoggerFactory.getLogger(Algorithm.class);

  private static final String EMPTY_STRING = "";
  private static final String SPACE_SEPARATOR = " ";

  public static boolean isGeneratedByLuhnAlgorithm(String number) {
    String numberRemovedWhitespace = formatCardNumber(number);
    boolean result;
    try {
      int sum = 0;
      boolean isEvenDigit = false;
      for (int i = numberRemovedWhitespace.length() - 1; i >= 0; i--) {
        int n = Integer.parseInt(numberRemovedWhitespace.substring(i, i + 1));
        if (isEvenDigit) {
          n *= 2;
          if (n >= 10) {
            n = (n % 10) + 1;
          }
        }
        sum += n;
        isEvenDigit = !isEvenDigit;
      }
      result = sum % 10 == 0;
    } catch (RuntimeException e) {
      logger.info(number + " is not a valid number.");
      result = false;
    }
    return result;
  }

  public static String formatCardNumber(String number) {
    return number.replace(SPACE_SEPARATOR, EMPTY_STRING);

  }
}
