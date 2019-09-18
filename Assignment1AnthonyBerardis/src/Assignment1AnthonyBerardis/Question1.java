package Assignment1AnthonyBerardis;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]; // declaring array
		intArray = new int[10]; // creates spaces for array
		int count=0;

		// initializes first element
		intArray[0] = 17;

		// initializes last element
		intArray[9] = 29;
		
		//initializes the rest of the array
		intArray[1] = -1;
		intArray[2] = -1;
		intArray[3] = -1;
		intArray[4] = -1;
		intArray[5] = -1;
		intArray[6] = -1;
		intArray[7] = -1;
		intArray[8] = -1;

		for (int i: intArray){
		     intArray[count] = i+1;
			Question1.writeOutLine(intArray[count]);
		     count++;
		}
		
		
		// Prints each line of array on separate lines
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		System.out.println(intArray[5]);
		System.out.println(intArray[6]);
		System.out.println(intArray[7]);
		System.out.println(intArray[8]);
		System.out.println(intArray[9]);
		
		if (intArray.length >= 1) {
		    System.out.print(intArray[0]);
		}

		// prints each element seperated by a comma
		for (int i = 1; i < intArray.length; i++) { 
		     System.out.print("," + intArray[i]);
		}
	}

	private static void writeOutLine(int i) {
		// TODO Auto-generated method stub
		
	}

}
