package Basics;

public class Strings {
	public static void main (String [] args) {
		String bookTitle;
		String wordChoice="Ring";
		bookTitle="Lord of the Rings ";
		if (bookTitle.contains(wordChoice)) {
			System.out.println ("book contains the word " + wordChoice);
		}
		String browser="Chrome";
		if (browser.contentEquals("Chrome")) {
			System.out.println ("Browser is Chrome");
		}
	}
}
