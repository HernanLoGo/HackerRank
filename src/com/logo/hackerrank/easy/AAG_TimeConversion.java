package com.logo.hackerrank.easy;

import java.text.DecimalFormat;

public class AAG_TimeConversion {

	static String timeConversion(String s) {

		String result = "";
		DecimalFormat formato = new DecimalFormat("00");
		int indexHour = s.indexOf(':');
		String sHour = s.substring(0, indexHour);
		int intHour = Integer.parseInt(sHour);

		if (s.contains("AM")) {
			if (intHour == 12) {
				intHour = 0;
			}
			result = String.valueOf(formato.format(intHour)) + s.substring(indexHour, s.indexOf("AM"));
		} else {
			if (intHour < 12) {
				intHour += 12;
			}

			result = String.valueOf(formato.format(intHour)) + s.substring(s.indexOf(':'), s.indexOf("PM"));
		}

		return result;

	}

	public static void main(String[] args) {

		String result = timeConversion("12:40:22AM");

		System.out.println(result);

	}
}
