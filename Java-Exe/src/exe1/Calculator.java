package exe1;

public class Calculator {
	
	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int add = i + j;
		int substract = i - j;
		int divide = i / j;
		int multiple = i * j;
		System.out.println("Add ::>> "+ i + " + " +  j + " = " + add);
		System.out.println("Substract ::>> "+ i + " - " +  j + " = " + substract);
		System.out.println("Divide ::>> "+ i + " / " +  j + " = " + divide);
		System.out.println("Multipe ::>> "+ i + " * " +  j + " = " + multiple);
	}

}
