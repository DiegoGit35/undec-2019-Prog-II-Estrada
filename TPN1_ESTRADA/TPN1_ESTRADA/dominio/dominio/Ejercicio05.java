package dominio;

public class Ejercicio05 {

	public static int sumaIndicesIgualesAValorDado(int [][] A, int valorDado){
		int sumai=0;
		for (int i = 0; i < A.length; i++) {
			for (int k = 0; k < A[i].length; k++) {
				if(A[i][k]==valorDado) {
					sumai+=k;
					sumai+=i;
				}
			}
		}
		return sumai;
	}
}
	
//	public static void main(String[] args)
//	int a []  =new int[4];
//	
//	int b [][]  =new int [2][3];
//			
//	for (int i=0; i<b.length;i++) {
//		for (int j=0; j<b[i].length;j++) {
//			b[i][j]=5;
//		}
//	}
//	for (int i=0; i<b.length;i++) {
//		for (int j=0; j<b[i].length;j++) {
//			System.out.println(b[i][j]);
//		}
//	}
//}
