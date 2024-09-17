package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range=8;

		int a = 0, b = 1;


		for (int i = 1; i <= range ; i++) {

			System.out.print(a + "," );

			int sum = a+b;

			a=b;

			b=sum;

		}

	}

}
