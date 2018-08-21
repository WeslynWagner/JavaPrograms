/*
 * September 20, 2016
 *Version 1.0
 *EE 5343 UTSA: Java Assignment #2 Parts a-f
 *Student: Weslyn Wagner
 */
import java.util.Arrays;
import java.math.*;
import java.lang.*;

class Matrix{
	public static void main(String[] args){
	int[][] matA= {{1,2,3},{6,5,7},{4,8,9}}; 
	int[][] matB= {{0,1,4},{2,3,8},{0,2,3}};
	
	System.out.println("a)Calling matShow on the matAdd method");
	matShow(matAdd(matA,matB));
	System.out.println("b)Calling matShow on the matMult method");
	matShow(matMult(matA,matB));
	System.out.println("c)Calling matShow on the matInv method result");
	matShow(matInv(matA));
	System.out.println("d)Calling matShow on matA and matB");
	matShow(matA);
	matShow(matB);
	
	}

	public static int[][] matAdd(int[][] matA, int[][] matB){
	int[][] matC= {{0,0,0},{0,0,0},{0,0,0}};
	int num;
		for(int i=0;i<matA.length;i++){
			for(int j=0;j<matA[i].length;j++){
				num = matA[i][j]+matB[i][j];
				matC[i][j] = num;
			}
		}

	return matC;	
	}
	
	public static int[][] matMult(int[][] matA, int[][] matB){
	int[][] matC= {{0,0,0},{0,0,0},{0,0,0}};
	int num;
		for(int i=0;i<matA.length;i++){
			for(int j=0;j<matA[i].length;j++){
				num = matA[i][j]*matB[i][j];
				matC[i][j] = num;
			}
		}

	return matC;	
	}
	
	public static double[][] matInv(int[][] matA){
	int[][] matMinor= {{0,0,0},{0,0,0},{0,0,0}};
	matMinor[0][0]= matA[1][1]*matA[2][2]-matA[1][2]*matA[2][1];
	matMinor[0][1]= matA[1][0]*matA[2][2]-matA[1][2]*matA[2][0];
	matMinor[0][2]= matA[1][0]*matA[2][1]-matA[1][1]*matA[2][0];
	matMinor[1][0]= matA[0][1]*matA[2][2]-matA[0][2]*matA[2][1];
	matMinor[1][1]= matA[0][0]*matA[2][2]-matA[0][2]*matA[2][0];
	matMinor[1][2]= matA[0][0]*matA[2][1]-matA[0][1]*matA[2][0];
	matMinor[2][0]= matA[0][1]*matA[1][2]-matA[0][2]*matA[1][1];
	matMinor[2][1]= matA[0][0]*matA[1][2]-matA[0][2]*matA[1][0];
	matMinor[2][2]= matA[0][0]*matA[1][1]-matA[0][1]*matA[1][0];
	
	int[][] matCoFact = matMinor;
	matCoFact[0][1]= matMinor[0][1]*-1;
	matCoFact[1][0]= matMinor[1][0]*-1;
	matCoFact[1][2]= matMinor[1][2]*-1;
	matCoFact[2][1]= matMinor[2][1]*-1;
	
	int[][] matTr= {{0,0,0},{0,0,0},{0,0,0}};
		for(int i=0;i<matCoFact[0].length;i++){
			for(int j=0;j<matCoFact.length;j++){
				matTr[i][j] = matCoFact[j][i];
			}
		}
	double det;
	det = matA[0][0]*matMinor[0][0]	- matA[0][1]*matMinor[0][1] + matA[0][2]*matMinor[0][2];
	
	double[][] matFinal={{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}};
		for(int i=0;i<matFinal.length;i++){
			for(int j=0;j<matFinal[i].length;j++){
			matFinal[i][j]= (double)matTr[i][j];
			}
		}
	
		for(int i=0;i<matFinal.length;i++){
			for(int j=0;j<matFinal[i].length;j++){
				matFinal[i][j]= (1/det)*(double)matTr[i][j];
			}
		}
	return matFinal;	
	}
	
	public static void matShow(int[][] matA){
		System.out.println("Matrix in grid form");
		for(int i=0;i<matA.length;i++){
			for(int j=0;j<matA[i].length;j++){
				String value = Integer.toString(matA[i][j]);
				if(value.length()==1){
					System.out.print(value+ "   ");
				}
				else if(value.length()==2){
					System.out.print(value+ "  ");
				}
				else{
					System.out.print(value+ " ");
				}
				
			}
			System.out.println("");
		}	
	}
	public static void matShow(double[][] matA){
		System.out.println("Matrix in grid form");
		for(int i=0;i<matA.length;i++){
			for(int j=0;j<matA[i].length;j++){
				String value = Double.toString(matA[i][j]);
				int index = value.indexOf(".");
				if(value.length()<=3){
					System.out.print("  "+value+ "  ");
				}
				else if(value.length()==4){
					System.out.print(" "+value+ "  ");
				}
				else{
					System.out.print(value.substring(0,index+4) + "  ");
				}
			}
			System.out.println("");
		}	
	}
}