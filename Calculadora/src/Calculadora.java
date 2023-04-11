import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num1 = input.nextInt();
		System.out.print("Que operacao deseja realizar? (+,-,*,/): ");
		char op = input.next().charAt(0);
		System.out.print("Digite o segundo valor: ");
		int num2 = input.nextInt();
		
		switch(op){
			case '+':
				System.out.printf("%d + %d = %d", num1, num2, num1+num2);
				break;
			case '-':
				System.out.printf("%d + %d = %d", num1, num2, num1-num2);
				break;
			case '*':
				System.out.printf("%d + %d = %d", num1, num2, num1*num2);
				break;
			case '/':
				System.out.printf("%d + %d = %d", num1, num2, num1/num2);
				break;
			default:
				System.out.print("Operacao invalida.");
		}
	}
}
