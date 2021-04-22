package com.ynov.methotest2.ex1;

public class Exo1 {
	
	public String concatenate(String sep, String... strings) {
		if(sep == null)
			throw new RuntimeException("Separator can't be null");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < strings.length; i++) {
			if(strings[i] == null)
				throw new RuntimeException("Can't concatenate null word");
				
			sb.append(strings[i]);
			if(i < strings.length - 1)
				sb.append(sep);
		}
		return sb.toString();
	}
	
	public int sum(int... ints) {
		int sum = 0;
		for(int i : ints) {
			sum += i;
		}
		return sum;
	}
	
}
