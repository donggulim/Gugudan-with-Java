
class Gugudan{
	public static int[] calculate(int times) {
		int[] result=new int[10];	
		for(int i=0;i<=9;i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	
	public static void print(int[] result){
		for(int i=0;i<10;i++){
			System.out.println(result[i]);
		}
	}
	}

