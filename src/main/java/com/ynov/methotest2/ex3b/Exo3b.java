package com.ynov.methotest2.ex3b;

public class Exo3b {
	
	public String format(String s, int lineLength, int wordLength) {
		StringBuilder formatted = new StringBuilder();
		String currentLine = "";
		
		for(int i = 0; i < s.length(); i++) {
			currentLine += s.charAt(i);
			if(s.charAt(i) == '\n' || i == s.length() - 1) {
				formatted.append(currentLine);
				currentLine = "";
			}
			else if(currentLine.length() > lineLength) {
				int lastIndex = currentLine.lastIndexOf(' ');
				if(lastIndex == -1 || (currentLine.length() - lastIndex + s.indexOf(' ', i) - i) > wordLength) {
					formatted.append(currentLine.substring(0, currentLine.length() - 2)).append("-\n");
					i -= 2;
					currentLine = "";
				}
				else {
					formatted.append(currentLine.substring(0, lastIndex)).append('\n');
					i -= currentLine.length() - 1 - lastIndex;
					currentLine = "";
				}
			}
		}
		return formatted.toString();
	}
	
}
