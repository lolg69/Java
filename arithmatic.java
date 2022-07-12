import java.util.Scanner;
class arithmatic {
	public static void main(String[] args){
		System.out.println("Please mention the first number: ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		System.out.println("Please mention the second number: ");
		int a2 = sc.nextInt();
		int add = a1 + a2;
		int sub = a1 - a2;
		int mul = a1*a2;
		float div = a1/a2;
		System.out.println(" Addition: " + add + " Subtraction: " + sub + " Multiplication: " + mul + " Division: " + div);
	}
}