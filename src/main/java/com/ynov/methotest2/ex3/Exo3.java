package com.ynov.methotest2.ex3;

public class Exo3 {
	
	public String format(String s, int lineLength) {
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
				if(lastIndex == -1) {
					throw new RuntimeException("Absence d'espace sur plus de " + lineLength + " caractères!");
				}
				String part = currentLine.substring(0, lastIndex);
				formatted.append(part);
				formatted.append('\n');
				i -= currentLine.length() - 1 - lastIndex;
				currentLine = "";
			}
		}
		return formatted.toString();
	}
	
}
