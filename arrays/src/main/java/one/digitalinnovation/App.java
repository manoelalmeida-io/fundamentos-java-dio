/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package one.digitalinnovation;

public class App {

	public static void main(String[] args) {

		Integer[] meuArray = new Integer[7];
		Integer[] meuArray2 = { 12, 32, 54, 6, 8, 89, 64 };

		System.out.println(meuArray[1]);
		System.out.println(meuArray2[3]);

		meuArray2[2] = 10;

		System.out.println(meuArray2[2]);
		System.out.println(meuArray.length);

		for (int i = 0; i < meuArray2.length; i++) {
			System.out.printf("%d ", meuArray2[i]);
		}

		System.out.println();

		Integer[][] meuArrayMulti = {{1, 2, 3, 4}, {53, 63, 73}};

		for (int i = 0; i < meuArrayMulti.length; i++) {
			for (int j = 0; j < meuArrayMulti[i].length; j++) {
				System.out.printf("%d ", meuArrayMulti[i][j]);
			}
			System.out.println();
		}
	}
}
