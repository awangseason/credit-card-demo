package com.softhouse.cardchecker.data;

import com.softhouse.cardchecker.utility.Algorithm;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Card {
  default boolean isThisType(String number) {
    boolean isThisType = false;
    for (Pattern pattern: getPatterns()) {
      Matcher matcher = pattern.matcher(number);
      isThisType = matcher.matches();
      if (isThisType) {
        return true;
      }
    }
    return isThisType;
  }

  default boolean isValid(String number) {
    return Algorithm.isGeneratedByLuhnAlgorithm(number);
  }
  Collection<Pattern> getPatterns();
}
