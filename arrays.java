import java.util.Arrays;


class arrays {
	public static void main(String[] args){
	/*
	*/
	int[][] a = {{1,2,3},{4,5,6}};
	arrayPrint(a);
	
	double num = 10.0;
	int num2 = 1;
	System.out.println("number is: "+(num2/num));
	
	}

	
	static void arrayPrint(int[][] x){
		System.out.print("");
		for (int i=0;i<x.length;i++){
			for(int j=0; j<x[i].length;j++){
				System.out.println("x[i][j] is:"+ x[i][j] );
			}
			System.out.println("x[i] is:"+ Arrays.toString(x[i]) );
		}
	}
	

}