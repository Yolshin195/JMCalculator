package com.app;

public class Utils {
  public static Boolean isInteger(String n) {
    return n.matches("(^[1-9]$)|(^10$)");
  }

  public static Boolean isRomanNumber(String n) {
    return n.matches("(^[IiVv]+$)|(^[Xx]$)|(^[Ii][Xx]$)");
  }
}
