public static int[][] pascalsTriangle(int n) {

	// Declare 2d array
	int[][] pt = new int[n][]; // Initialize an array with n references

	for (int i = o; i < n; i++) { // Loop through each row of triangle

		pt[i] = new int[i + 1]; // For each row, set new array
		pt[i][0] = 1; // Fill in left margin of triangle with 1's

		for (int j = 1; j < i; j++) { // Fill in numbers in each array

			// Fill in each row between margins with appropriate numbers
			pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];

		}

		pt[i][i] = 1; // Fill in right margin of triangle

	}

	return pt;

}