package main;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		int i = 0;
		String output = "";
		
		while(i<input.length())
		{
			String x = input.substring(i,i+1);
			
			for(int y = 0; y < 3; y++)
			{
				output = output + x;
			}
			
			i++;
			System.out.println(output);
		}
		return output;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		String output;
		String backwards = "";
		boolean firstInd = false;
		boolean secondInd = false;
		int finish = 0;
		int start = 0;
		
		String lower = input.toLowerCase();
		
		if(lower.contains("bert"))
		{
		
			start = lower.indexOf("bert")+4; // Finding index of first bert
			
			if(lower.substring(start).contains("bert"))
			{
				firstInd = true;
			}
		}
		
		else
		{
			backwards = "";
		}
		
		if(firstInd == true) 
		{
			
			finish = lower.lastIndexOf("bert"); 
			secondInd = true;
		}
		
			if (secondInd == true)
			{
			output = lower.substring(start,finish); // Making a substring from inbetween berts
	
			for(int i = output.length(); i > 0; i--) //iterating through substring to print word out backwards
			{
				backwards = backwards + output.substring(i-1, i);
			}
		
		}
		
			
		System.out.println(backwards);
		return backwards;

	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		boolean answer = false;
		int high = 0;
		int mid = 0;
		int low = 0;

		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(a);
		num.add(b);
		num.add(c);
		
		num.sort(null);
		
		
		low = num.get(0);
		mid = num.get(1);
		high = num.get(2);
		
		
		if(mid - low == high - mid)
		{
			answer =true;
		}
		else
		{
			answer = false;
		}
		
		return answer;
	
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		
		
		String answer ="";
		
	
		int x = input.length();
		int mid = x/2;
		int eitherSide = (a-1)/2;
		
		
		String word = input.substring(0, mid-eitherSide );
		System.out.println("Word = " + word);
		String word2 = input.substring((mid+eitherSide)+1);
		System.out.println("Word2 = " + word2);
		answer = word + word2;
		
		System.out.println(answer);

		return answer;
		
		
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("jh") → false
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		String last3 = "";
		boolean dev = false;
		
		last3 = input.toLowerCase();
		
		if(last3.endsWith("dev"))
		{
			dev = true;
		}
		return dev;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int highestBlock = 0;
		int currentBlock = 0;
		
		if(input.equals(""))
		{
			return 0;
		}
		else {
		
		String previousChar  = "";
		String currentChar = input.substring(0, 1);;
		
			
		
		for(int i = 0; i< input.length() -1; i++)
		{
			 previousChar = currentChar;
			 currentChar = input.substring(i, i+1);
			 
			 System.out.println("current char is : " + currentChar);
			 System.out.println("Previous char is: " + previousChar);
			 
			 if(currentChar.equals(previousChar))
			 {
				 currentBlock++;
				 
			 }
			 if(currentBlock > highestBlock)
			 { 
				 highestBlock = currentBlock;
				 System.out.println("Current Block was: " + currentBlock);
				 currentBlock = 0;
			 }
		}
		
		}
		System.out.println("Highest Block was: " + highestBlock);
		
		return highestBlock;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		
		int answer = 0;
		
		String input = arg1.toLowerCase();
		
		
		

			 if(input.contains("am ") || input.contains(" am"))
			 {
				
				 
				answer++;
			 }
		
	
		
		return answer;		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		String output = "";
		
		
		
		if(arg1 % 3 == 0 && arg1 % 5 == 0)
		{
			output = "fizzbuzz";
		}
		else if(arg1 % 3 == 0)
		{
			output = "fizz";
		}
		else if(arg1 % 5 == 0)
		{
			output = "buzz";
		}
		
		
		return output;
		
	}

	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		
		int currentLargest = 0;
		int i = 0;

		while ( i<arg1.length() -1)
		{
			if(Integer.valueOf(arg1.charAt(i)) == -1)
			{
				i++;
			}
			else {
				int firstNum = Integer.valueOf(arg1.charAt(i));
				int secondNum = Integer.valueOf(arg1.charAt(i+1));
				int total = Character.getNumericValue(firstNum) + Character.getNumericValue(secondNum);
				System.out.println(total);
				i++;
				
				if(total > currentLargest)
				{
					currentLargest = total;
				}
			}
			
		}
		
	
		return currentLargest;
		
		
	}
	
	
}
