package Q_05;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = sc.nextInt();
		System.out.print("Digite o quarto n�mero: ");
		num4 = sc.nextInt();

		if (num4 < num1) {
			System.out.println(num3 + ", " + num2 + ", " + num1 + ", " + num4);
		} else if (num4 < num2) {
			System.out.println(num3 + ", " + num2 + ", " + num4 + ", " + num1);
		} else if (num4 < num3) {
			System.out.println(num3 + ", " + num4 + ", " + num2 + ", " + num1);
		} else {
			System.out.println(num4 + ", " + num3 + ", " + num2 + ", " + num1);
		}
	}
}

