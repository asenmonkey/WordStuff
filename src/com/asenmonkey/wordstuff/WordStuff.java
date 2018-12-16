package com.asenmonkey.wordstuff;

public class WordStuff {

	private static final char[] Vowels = {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) {
		Menu.openMenu();
	}
	
	public static Integer countWords(String words) {
		String[] word = words.split(" ");
		return word.length;
	}
	
	public static String reverseMessage(String word) {
		String newMessage = "";
		for(char i : word.toCharArray()) {
			newMessage = i + newMessage;
		}
		return newMessage;
	}
	
	public static Integer characterCount(String word) {
		String[] words = word.split(" ");
		Integer count = 0;
		for(String w : words) {
			 count = count + w.length();
		}
		return count;
	}
	
	public static Integer vowelsCount(String word) {
		Integer count = 0;
		String[] words = word.split(" ");
		for(String w : words) {
			for(char c : w.toCharArray()) {
				for(char v : Vowels) {
					if(c == v) {
						count = count + 1;
					}
				}
			}
		}
		return count;
	}
	
	public static boolean Palindrome(String word) {
		String reverse = reverseMessage(word);
		if(word.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
	
}
