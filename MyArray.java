    /** 
     * A simple class that includes 5 methods to manipulate given arrays passed as parameters.
     *  
     * @author Annika Hoag
     */
public class MyArray {
	
	    /**
	     * Constructs a new MyArray instance when called.
	     */ 
	public MyArray(){ }


	    /**
	     * Finds the maximum int value in the given array.
	     * @param nums -> the array of integers whose maximum value will be found
	     * @return -1 -> if nums[] is empty, else currentMax -> the maximum value in the array 
	     */
	public int findMax (int [] nums){
		if (nums.length == 0){						//make sure nums[] isn't empty
			return -1;
		}

		int currentMax = nums[0];					//sets the starting max to first index of nums[]

		for (int i=1; i<nums.length; i++){			//tests if each value in nums[] is greater than the current max
			if (nums[i] > currentMax){
				currentMax = nums[i];				//reset currentMax if greater value is found
			}
		}//close for loop

		return currentMax;
	}


		 /**
		  * Finds the minimum int value in the given array.
		  * @param nums -> the array of integers whose minimum value will be found
		  * @return -1 -> if nums[] is empty, else currentMin -> the minimum value in the array
		  */ 
	public int findMin (int [] nums){
		if (nums.length == 0){						//make sure nums[] isn't empty
			return -1;
		}

		int currentMin = nums[0];					//sets the starting min to first index of nums[]

		for (int i=1; i<nums.length; i++){			//tests if each value in nums[] is less than the current min
			if (nums[i] < currentMin){
				currentMin = nums[i];				//reset currentMin if smaller value is found
			}
		}//close for loop

		return currentMin;
	}


		/** 
		 * Computes total sum of values in the given array.
		 * @param nums -> the array of integers whose sum will be calculated
		 * @return sum -> the total of the array's values
		 */ 
	public int total (int [] nums){
		int sum = 0;					//sets sum to 0 to start off

		for (int i=0; i<nums.length; i++){
			sum += nums[i];				//adds each value of nums[] to sum
		}//close for loop

		return sum;
	}

 
		/**
		 * Computes average value of the given array.
		 * @param nums -> the array of integers whose values will be averaged
		 * @return the decimal average of all the array's values
		 */ 
	public double average (int [] nums){
		double sum;								//declares sum variable to be used in calculation

		sum = (double) this.total (nums);		//calls previous total() method to find array sum, cast as double to provide more exact average
		return (sum / nums.length);				//finds average by dividing the sum by the number of values in the array
	}


		/**
		 * Finds the older person's name from 2 given parallel arrays.
		 * @param names -> String array of people's names
		 * @param ages -> int array of people's ages, assumed to indicate the age of the person whose name is at the same index in names[]
		 * @return the name of the person whose age is the greatest
		 */ 
	public String findOldestPerson (String [] names, int [] ages){
		int oldest = ages[0];					//set original oldest age to first index of ages[]
		int oldIndex = 0;						//set index of oldest age to 0 to start 

		for (int i=1; i<ages.length; i++){		//test if each value in ages[] is greater than the current oldest
			if (ages[i] > oldest){
				oldest = ages[i];				//resets oldest if greater value is found
				oldIndex = i;					//sets oldIndex to the index that the greater value is found at
			}
		}//close for loop

		return names[oldIndex];					//returns the String in names[] at the index at which the oldest age was found 
	}


}//close MyArray class



/**
 * Creates 3 arrays and an instance of the MyArray class in order to test each of the 5 methods in the MyArray class. 
 * 
 * @author Annika Hoag
 */ 
class MyArrayTest{
	public static void main (String [] args){

		/**
		 * Arrays to be set as parameters when we call the methods in the MyArray class.
		 */ 
		int [] testNums = {5, 10, 11, 54, 60, 12, 4, 8, 1, 20};
		int [] testAges = {30, 25, 50, 12, 6, 10, 55, 36, 21, 31};
		String [] testNames = {"James", "Tom", "Jessica", "Jones", "Betty", "Ted", "Jane", "Bruce", "Clark", "Daniel"};
		
		/**
		 * Variables to be set as method return values.
		 */ 
		int max, min, sum;
		double average;
		String oldest;

		/**
		 * Creates an instance of the MyArray class.
		 */ 
		MyArray testArray = new MyArray();

		/**
		 * Calls all methods in MyArray class.
		 */ 
		max = testArray.findMax(testNums);
		min = testArray.findMin(testNums);
		sum = testArray.total(testNums);
		average = testArray.average(testNums);
		oldest = testArray.findOldestPerson(testNames, testAges);

		/**
		 * Prints return values so we can see if the values are what we expect.
		 */ 
		System.out.println("\nThe maximum value in the array testNums is " + max + ".");
		System.out.println("\nThe minimum value in the array testNums is " + min + ".");
		System.out.println("\nThe total sum of the values in the array testNums is " + sum + ".");
		System.out.println("\nThe average of the values in the array testNums is " + average + ".");
		System.out.println("\nThe oldest person is " + oldest + ".");

	}//close main 
}//close MyArrayTest