

public class UserMainCode {

	public static boolean checkTriplets(int arr[]) {
		boolean result = false;
		int currElement = arr[0];
		int tripletCheckCounter = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == currElement) {
				tripletCheckCounter++;
				if (tripletCheckCounter == 3) {
					result = true;
					break;

				}
				continue;
			} else {
				currElement = arr[i];
				tripletCheckCounter = 1;
			}

		}

		return result;

	}
}
