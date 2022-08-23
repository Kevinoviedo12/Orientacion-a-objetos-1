package matrices;

import matrices.Matriz;

public class MatrizTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz1 = new double[3][3];
		matriz1 = new double[][] {{3,4,2},{6,3,6},{9,7,5}};
		double[][] matrizB = {{5,1,1},{2,1,9},{7,7,5}};

		
		Matriz m1 = new Matriz(matriz1);

		m1.mostrarMatriz();
		System.out.println("La suma es: ");
		m1.mostrarMatriz(m1.sumar(matrizB));
		System.out.println("La resta es: ");
		m1.mostrarMatriz(m1.restar(matrizB));
		
	}

}
