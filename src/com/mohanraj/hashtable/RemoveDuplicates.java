package com.mohanraj.hashtable;

import java.util.Arrays;
import java.util.Hashtable;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String st = "asdasdasd";
		char[] s = st.toCharArray();
		int i = 0;
		int j = 0;
		int count = 0;
		Hashtable<Character, Boolean> h = new Hashtable<Character, Boolean>();

		for (; i < s.length; i++) {
			System.out.println(h.get(s[i]));
			if (h.get(s[i]) == null) {
				h.put(s[i], true);
				s[j] = s[i];
				j++;
				count++;
			}
		}
		char[] r = Arrays.copyOf(s, count);
		System.out.println(r);
	}
}
