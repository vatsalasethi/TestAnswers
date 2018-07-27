

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int size;
		System.out.println("Enter size of array");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		if (UserMainCode.checkTriplets(arr))
			System.out.println("Contains Triplets");
		else
			System.out.println("No triplets found");
	}
}
