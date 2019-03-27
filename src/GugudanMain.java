import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inputValue=scanner.nextLine();
		String[] splitedValue=inputValue.split(",");
		
		if(inputValue.contains(",")) {	
			int first  = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			
			for(int i=2 ; i<=first;i++) {
			int[] result=Gugudan.calculate(i,second);
			Gugudan.print(result);	
			}
		
		}
		else {
			int first = Integer.parseInt(splitedValue[0]);
			int[] result=Gugudan.calculate(first);
			Gugudan.print(result);
			}
		}
		
	}	


	
	




