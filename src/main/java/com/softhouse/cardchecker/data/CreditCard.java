package com.softhouse.cardchecker.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum CreditCard implements Card {
  AMEX("^3[47]\\d{13}$"),
  Discover("^6011\\d{12}$"),
  MasterCard("^5[1-5]\\d{14}$"),
  Visa("^4\\d{12}$", "^4\\d{15}$");

  private final Collection<Pattern> patterns;

  CreditCard(String... patterns) {
    this.patterns = Arrays.asList(patterns).stream()
                          .map(p -> Pattern.compile(p))
                          .collect(Collectors.toList());
  }

  public Collection<Pattern> getPatterns() {
    return patterns;
  }
}
