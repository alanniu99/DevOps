package com.ts;

public class TriangleChecker {
	public  String isTrigon(double a, double b, double c) {
		String result = "";
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b || a == c || b == c) {
				if (a == b && b == c) {
					result = "equilateral";
				} else {
					result = "isosceles";
				}
				return result;
			}
			return "scalene";
		}
		return "NotTriangle";
	}

}
