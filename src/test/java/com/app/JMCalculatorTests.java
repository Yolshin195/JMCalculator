/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class JMCalculatorTests {

	@Test
  void isInteger() {
    String[] t = {
      "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    };

    for(int i = 0; i < t.length; i++) {
      assertTrue(Utils.isInteger(t[i]));
    }

    String[] f = {
      "11", "100", "-10", "80", "X", "C", "I", "70"
    };

    for(int i = 0; i < f.length; i++) {
      assertFalse(Utils.isInteger(f[i]));
    }
  }

	@Test
  void isRomanNumber() {
    String[] t = {
      "I", "II", "iii", "iV", "v", "VI", "VII", "VIII", "IX", "X"
    };

    for(int i = 0; i < t.length; i++) {
      assertTrue(Utils.isRomanNumber(t[i]));
    }

    String[] f = {
      "11", "100", "-10", "80", "XX", "C", "CI", "70"
    };

    for(int i = 0; i < f.length; i++) {
      assertFalse(Utils.isRomanNumber(f[i]));
    }
  }

	@Test
	void addition() {
    String[][] params = {
			{"10", "+", "10"}, {"20"},
			{"X", "+", "X"}, {"XX"},
			{"X", "+", "V"}, {"XV"},
		};

		calculateTest(params);
	}

	@Test
	void subtraction() {
    String[][] params = {
			{"10", "-", "10"}, {"0"},
			{"X", "-", "X"}, {""},
			{"X", "-", "V"}, {"V"},
		};

		calculateTest(params);
	}

	@Test
	void multiplication() {
    String[][] params = {
			{"10", "*", "10"}, {"100"},
			{"X", "*", "X"}, {"C"},
			{"X", "*", "V"}, {"L"},
		};

		calculateTest(params);
	}

	@Test
	void division() {
    String[][] params = {
			{"10", "/", "10"}, {"1"},
			{"X", "/", "X"}, {"I"},
			{"X", "/", "V"}, {"II"},
		};

		calculateTest(params);
	}

	void calculateTest(String[][] params) {
		
			try {
				for(int i = 0; i < params.length; i += 2) {
					assertEquals(params[i+1][0], JMCalculator.calculate(params[i]));
				}
			} catch(UnsupportedArithmeticOperationException e) {
				System.out.println(e.getMessage());
			} catch(InvalidOperandsException e) {
				System.out.println(e.getMessage());
			}
	}

}
