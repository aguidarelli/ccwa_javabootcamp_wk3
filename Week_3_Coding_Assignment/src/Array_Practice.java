
public class Array_Practice {
	
	// new methods belong out here, outside of "main"

	public static void main(String[] args) {
		//Q1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //array length is stuck 
		int[] tst = new int[5];
		//Q1a) Programmatically subtract the value of the first element in the array from the value in the last element of the array
		int diff = ages[ages.length - 1] - ages[0];
		System.out.println(diff);
		//Q1b) Add a new age to your array and repeat the step above to ensure it is dynamic
		// ************ this doesnt work ********************
		int[] newAges = new int[(ages.length + 1)];
		newAges[ages.length] = 9; //this will be the last element at index = 8 (9 elements)
				for(int i = 0; i < ages.length; i ++) {
			newAges[i] = ages[i];
			}
				for(int i = 0; i <= ages.length; i++) {
					System.out.println(newAges[i]);
				}
	
		//Q1c Use a loop to iterate through the array and calculate the average age
		// 
		int sum = 0;
		double avgAge;
		for ( int age : newAges) {
			sum = age + sum;
		}
		avgAge = (double)sum/(newAges.length);
		System.out.println("The average age is " + avgAge);
		
		//Q2 Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Q2a Use a loop to iterate through the array and calculate the average number of letters per name
		int letters = 0;
		double avgLetters;
		for( String name : names) {
			letters = name.length() + letters;
		}
		 avgLetters = (double)letters/names.length;
		 System.out.println("The average number of letters in each name is " + avgLetters);

		//Q2b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces 
		 String listNames = "";
		 for (String name : names) {
			 listNames = listNames + name + " ";
		 }
		 System.out.println(listNames);
		 
		//Q5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		//   and add the length of each name to the nameLengths array 
		 
		 int[] nameLengths = new int[names.length];
		 for (int i = 0; i <= (names.length - 1);  i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
				 }
		 			
		//Q6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array 
		 int totalLength = 0;
		 for( int length : nameLengths) {
			 totalLength = totalLength + length; 
		 }
		 System.out.println("The sum of the all the elements in the array is " + totalLength);
		
		//Q7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times
		
		//Q8 Write a method that takes two Strings, firstName and lastName, and returns a full name
		
		//Q9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		
		//Q10 Write a method that takes an array of double and returns the average of all the elements in the array
		
		//Q11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		//    greater than the average of the elements in the second array
		
		//Q12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
		//    if it is hot outside and if moneyInPocket is greater than 10.50
	}



}
