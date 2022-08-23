package matrices;

import matrices.Matriz;

public class MatrizTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz1 = {{3,4,2},{6,3,6},{9,7,5}};
		double[][] matrizB = {{3,4,2},{6,3,6},{9,7,5}};

		
		Matriz m1 = new Matriz(matriz1);
		Matriz m2 = new Matriz(matrizB);


		m1.mostrarMatriz();

		
	}

}
