
class Gugudan{
	public static int[] calculate(int times) {
		int[] result=new int[times];	
		for(int i=0;i<result.length;i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	
	public static int[] calculate(int times, int b) {
		
		int[] result=new int[b];	
		for(int i=0;i<b;i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	
	
	public static void print(int[] result){
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}

