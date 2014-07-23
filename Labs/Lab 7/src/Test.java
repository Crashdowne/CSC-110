
public class Test {

	public static void main(String[] args)
	{
		int count =0;
		int[] a = {1, 7, 5, 6, 4, 14, 11};
		for (int i = 0; i < a.length
		-
		1; i++) {
		if (a[i] > a[i + 1]) {
		a[i + 1] = a[i + 1] * 2;
		
		}
		System.out.println(count);
		count++;
		}
	}
}
