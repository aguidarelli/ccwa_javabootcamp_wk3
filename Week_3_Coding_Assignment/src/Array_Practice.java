

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
		
		 // Final Answer for Q7
		 System.out.println(stringConcat("beer",3));
		 
		 // Final Answer for Q8
		 String fullname = nameConcat("Steve", "Smith");
		 System.out.println(fullname);
		 
		 // Final Answer for Q9
		 int[] x = {2, 2, 2};
		 System.out.println((bigNum(x)));
		 
		 //Final Answer for Q10
		 double[] sampArray = {36.75, 7854.2, 5.31};
		 System.out.println(calcAvg(sampArray));
		 
		 //Final Answer for Q11
		 double[] arrayOne = {57.8, 64, 5, 17.3};
		 double[] arrayTwo = {3, 5.63};
		 System.out.println(compareAvg( arrayOne, arrayTwo ));
		 
		 //Final Answer for Q12
		 Boolean isHotOutside = true;
		 double moneyInPocket = 100.50;
		 System.out.println(willBuyDrink( isHotOutside, moneyInPocket));
		 
		 //Final Answer for Q13
		 double salary = 65000;
		 int weeksOfVacation = 3;
		 System.out.println("My effective hourly wage is " + hourlyWage( salary, weeksOfVacation));
//		 When looking at jobs, I like to think about how much I might earn with every hour I spend on the job.
//		 A big salary is nice, but if you can't take much time off for vacation, your effective hourly wage might be lower
//		 than you'd expect. To use this method, you have to define the variable 'salary' in dollars and the variable
//		 'weeksOfVacation' with the number of weeks of vacation available per year.
//		 The hourlyWage method returns the effective hourly wage based on your annual salarly and the amount of vacation days
//		 you are given. 
		 
			}
			
	
			// ^ this is the end of the main method
			// new methods below
	
			//Q7 Write a method that takes a String, word, and an int, n, as arguments and returns the word 
			//concatenated to itself n number of times
				
		public static String stringConcat( String x, int y) {
			String wordReps = "";
			for ( int i = 0; i < y; i++) {
				wordReps += x;
			}
		return wordReps;
		}
			// see Line 70 for final answer
		
			//Q8 Write a method that takes two Strings, firstName and lastName, and returns a full name
		
		public static String nameConcat( String a, String b) {
			return a + " " + b;
			}
			
			// see Line 72 & 73 for final answer
		
			//Q9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is
		    //greater than 100
			
		public static Boolean bigNum( int[] x) {
			int sum = 0;
			for (int number : x ) {
			sum += number;	
			}
			Boolean tooBig = (sum > 100);
			return tooBig;
		}
			//see lines 78 & 79 for answer
		
			//Q10 Write a method that takes an array of double and returns the average of all the elements in the array
		
		public static double calcAvg( double[] numbers) {
			double sum = 0;
			for ( double num : numbers) {
				sum += num;
			}
			return sum / numbers.length;
		}
			//See Lines 82 & 83 for final answer
			
			//Q11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
			//    greater than the average of the elements in the second array
		
		
		public static Boolean compareAvg( double[] x, double[] y ) {
			double avg1 = calcAvg(x);
			double avg2 = calcAvg(y);
			Boolean bigger = (avg1 > avg2);
			return bigger;
			}
			
			// See Lines 86 thru 88 for final answer
		
			//Q12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
			//    if it is hot outside and if moneyInPocket is greater than 10.50
	
		public static Boolean willBuyDrink ( Boolean x, double y ) {
			Boolean buyDrink = (( x == true) && (y > 10.5));
			return buyDrink;
			}
		    // See Lines 91 thru 93 for final answer
		
			//Q13 Create a method of your own that solves a problem. In comments, write what the method does 
		    //    and why you created it.
		
		public static double hourlyWage (double x, int y ) {
			double workHours = (52-(double)y)*40;
			double hourlyWage = x / workHours;
			return hourlyWage;
		}
		
}
