package Assignment10SortingArray;

public class Assignemnt10_Sortingarray {

	public static void main(String[] args) {
		int temp = 0;
		// store the length =7
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };

		{
			for (int i = 0; i < arr.length; i++) {

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] < arr[j]) {

						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					}

				}

			}

		}

	//	System.out.println(arr[0]);
		System.out.println("Second largest number is :" + arr[1]);

		System.out.println("Third largest number is :" + arr[2]);
	}
}
