import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		String inputValue=scanner.nextLine();
		
		String[] splitedValue=inputValue.split(",");
		
		if(inputValue.contains(",")) {
			
			int first = Integer.parseInt(splitedValue[0]);
			int second= Integer.parseInt(splitedValue[1]);
		}
		else {
			int first = Integer.parseInt(splitedValue[0]);
		}
		
			int[] result=Gugudan.calculate(first);
			
			
		}	
}

	
	




