package com.logo.hackerrank.daysofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AAH_DictionariesAndMaps {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneBook.put(name, phone);
		}
		List<String> friends = new ArrayList<>();
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			friends.add(s);
		}
		in.close();

		for (String friend : friends) {
			if (phoneBook.containsKey(friend)) {
				System.out.println(friend + "=" + phoneBook.get(friend));
			} else {
				System.out.println("Not found");
			}
		}
	}

}
