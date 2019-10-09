package com.app;

import java.util.Arrays;
import java.util.Map;

public class RomanNumber {
    static Map<String, Integer> parseWeights = Map.of("I", 1, "V", 5, "X", 10);

  public static int parseInt(String n) {
    String[] argN = n.toUpperCase().split("");
    int[] argI = new int[argN.length];
    int sum = 0;

    for(int i = argN.length - 1; i >=0; i--) {
      argI[i] = parseWeights.get(argN[i]);
    }

    int i = argI.length - 1;
    while(i >= 0) {
      if((i > 0) && (argI[i] > argI[i-1])) {
        sum += (argI[i] - argI[i-1]);
        i -= 2;
        continue;
      }

      sum += argI[i];
      i -= 1;
    }

    return sum;
  }

  public static String toString(int n) {
      String sum = ""; 

    while(n > 0) {
      if(n >= 100) {
        sum += "C";
        n -= 100;
        continue;
      }

      if(n >= 90) {
        sum += "XC";
        n -= 90;
        continue;
      }

      if(n >= 50) {
        sum += "L";
        n -= 50;
        continue;
      }

      if(n >= 40) {
        sum += "XL";
        n -= 40;
        continue;
      }

      if(n >= 10) {
        sum += 'X';
        n -= 10;
        continue;
      }

      if(n >= 9) {
        sum += "IX";
        n -= 9;
        continue;
      }

      if(n >= 5) {
        sum += 'V';
        n -= 5;
        continue;
      }

      if(n >= 4) {
        sum += "IV";
        n -= 4;
        continue;
      }

      if(n >= 1) {
        sum += 'I';
        n -= 1;
        continue;
      }
    }

    return sum;
  }

  public static Boolean check(String n) {
    return n.matches("^[IiVvXx]+$");
  }
}
