package dominio;

import java.util.Arrays;

public class Ejercicio07 {

	 public static void ordenarMenorAMayor(int[] A) {
        Arrays.sort(A);
	 }
	 
	 public static void ordenarMayorAMenor(int[] A) {
		int aux, b;
        for (int i = 0; i < A.length; i++) {
        	b=0;
        	for (int j = 1; j < A.length; j++) {
				if(A[j-1]<A[j]) {
					aux=A[j-1];
					A[j-1]=A[j];
					A[j]=aux;
					b=1;
				}
			}
        	if(b==0)
        		break;
		}
	 }
	 
	 public static void ordenarMenorAMayorSubArray(int[] A, int indexInicio, int indexFin) {
		 int aux, b;
		 for (int i = indexInicio; i < indexFin; i++) {
			 b=0;
			 for (int j = indexInicio; j < indexFin; j++) {
				 if(A[j]>A[j+1]) {
					 aux=A[j];
					 A[j]=A[j+1];
					 A[j+1]=aux;
					 b=1;
				 }
			 }
			 if(b==0)
				 break;
		 }
	 } 
	 
	 public static void ordenarMayorAMenorSubArray(int[] A, int indexInicio, int indexFin) {
		 int aux, b;
	        for (int i = indexInicio; i < indexFin; i++) {
	        	b=0;
	        	for (int j = indexInicio+1; j < indexFin; j++) {
					if(A[j-1]<A[j]) {
						aux=A[j-1];
						A[j-1]=A[j];
						A[j]=aux;
						b=1;
					}
				}
	        	if(b==0)
	        		break;
			}
		 }
	 }

