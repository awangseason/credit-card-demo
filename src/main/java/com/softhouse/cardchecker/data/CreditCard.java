package com.softhouse.cardchecker.data;

import com.softhouse.cardchecker.utility.Algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum CreditCard {
  AMEX("^3[47]\\d{13}$"),
  Discover("^6011\\d{12}$"),
  MasterCard("^5[1-5]\\d{14}$"),
  VISA("^4\\d{12}$", "^4\\d{15}$");
  public static final String UNKNOWN_TYPE = "Unknown";

  private final Collection<Pattern> patterns;

  CreditCard(String... patterns) {
    this.patterns = Arrays.asList(patterns).stream()
                          .map(p -> Pattern.compile(p))
                          .collect(Collectors.toList());
  }

  private Collection<Pattern> getPatterns() {
    return patterns;
  }

  public String getCardTypeName() {
    return name();
  }

  public boolean isThisType(String number) {
    boolean isThisType;
    for (Pattern pattern: getPatterns()) {
      Matcher matcher = pattern.matcher(number);
      isThisType = matcher.matches();
      if (isThisType) {
        return true;
      }
    }
    return false;
  }

  public boolean isValid(String number) {
    return Algorithm.isGeneratedByLuhnAlgorithm(number);
  }
}
