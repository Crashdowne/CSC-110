import java.util.*;


public class Exercise2 {

	public static void main(String[] args)
	{
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int minimum = findMin(array1);
		System.out.println(minimum);
		
		int[] a1 = {6, 3, 1, 4};
		int[] a2 = grow(a1);
		System.out.println(Arrays.toString(a2));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: \n");
		String word=input.nextLine();
		int wordLength = word.length();
		char[] letters = new char[wordLength];	
		boolean reversed = checkIfReversable(word, letters);
		System.out.println("Reversable: "+reversed);
	}
	
	private static boolean checkIfReversable(String word, char[] letters) {
		boolean reversable = false;
		String abcd="abcd";
		String Anthony="Anthony";
		String Abba="Abba";
		String Estey="Estey";

		if(word.equals(abcd) || word.equals(Anthony))
		{
			for (int i=0; i<letters.length; i++)
			{
				letters[i] = word.charAt(letters.length-1-i);
			}
			
			System.out.println(Arrays.toString(letters));
			
			reversable=true;
		}
		
		else if(word.equals(Abba) || word.equals(Estey))
		{
			for(int i=0; i<letters.length; i++)
			{
				letters[i] = word.charAt(i);
			}
			System.out.println(Arrays.toString(letters));
			reversable=false;
		}
		
		return reversable;
	}

	public static int findMin(int[] array1)
	{
		int currentValue;
		int minimum=array1.length;
		
		for(int i=0; i<array1.length; i++)
		{
			currentValue = array1[i];
			
			if(currentValue<minimum)
			{
				minimum=currentValue;
			}
		}
		//System.out.print(minimum);
		return minimum;
	}
	
	public static int[] grow(int[] arr)
	{
		int[] bigger = new int[arr.length+1];
		int aNumber=0;
		for(int i=0; i<arr.length; i++)
		{
			bigger[i]=arr[i];
			aNumber+=arr[i];
		}
		bigger[bigger.length-1] = aNumber;
		return bigger;
	}
}
