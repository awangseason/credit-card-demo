package com.softhouse.cardchecker.controller ;

import com.softhouse.cardchecker.utility.CardChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CreditCardCheckerController {
  private static final Logger logger = LoggerFactory.getLogger(CreditCardCheckerController.class);

  @GetMapping("/check")
  public String checkCardNumber(@RequestParam(value = "number") String cardNumber) {
    String checkResult = CardChecker.getInstance().checkCardNumber(cardNumber).toString();
    logger.info("Received a request, the check result is: " + checkResult);
    return checkResult;
  }

}
