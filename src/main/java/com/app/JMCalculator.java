package com.app;

public class JMCalculator {
  public static void main(String[] args) {
    try {
      String r = calculate(args);
      System.out.println(r);
    } catch(UnsupportedArithmeticOperationException e) {
      System.out.println(e.getMessage());
    } catch(InvalidOperandsException e) {
      System.out.println(e.getMessage());
    }
  }

  private static int executeComands(String o, int a, int b) throws UnsupportedArithmeticOperationException {
    switch(o) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "/":
        return a / b;
      case "*":
        return a * b;
      default:
        throw new UnsupportedArithmeticOperationException();
    }
  }

  public static String calculate(String[] args) throws UnsupportedArithmeticOperationException, InvalidOperandsException {
    if(args.length != 3) {
      return "-1";
    }

    if(Utils.isRomanNumber(args[0]) && Utils.isRomanNumber(args[2])) {
      return calculateNumberRoman(args);
    } else if(Utils.isInteger(args[0]) && Utils.isInteger(args[2])) {
      return calculateNumber(args);
    } else {
      throw new InvalidOperandsException();
    }
  }

  public static String calculateNumber(String[] args) throws UnsupportedArithmeticOperationException {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[2]);

    int r = executeComands(args[1], a, b);

    return Integer.toString(r);
  }

  public static String calculateNumberRoman(String[] args) throws UnsupportedArithmeticOperationException {
    int a = RomanNumber.parseInt(args[0]);
    int b = RomanNumber.parseInt(args[2]);

    int r = executeComands(args[1], a, b);

    return RomanNumber.toString(r);
  }
}
