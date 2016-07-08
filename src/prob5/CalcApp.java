package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println(">>");
		String input = scanner.nextLine();
		if(input.equals ("q")==true){
			break;
		}
		String[] tokens = input.split(" ");
		
		int result;
		switch(tokens[1]){
		case "+":
			Add add = new Add();
			add.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]) );
			result =add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]) );
			result =sub.calculate();
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]) );
			result =mul.calculate();
			break;
		case "/":
			Div div = new Div();
			div.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]) );
			result =div.calculate();
			break;
		
		
		}
		
		
		}
	}

}
