package matrices;

public class Matriz {
	private double[][] matriz1 = new double[3][3];
	
	public Matriz(double[][] matriz1) {
		this.matriz1 = matriz1;
	}
	
	public void mostrarMatriz() {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public double[][]sumar(double[][] matrizB){
		double [][] suma = new double[matriz1.length][matriz1[0].length];
		for (int i = 0; i < matriz1.length; i++) {
		    for (int j = 0; j < matriz1[i].length; j++) {
		        suma[i][j] = matriz1[i][j] + matrizB[i][j];
		    }
		} 
		return suma;
	}
	
	public double[][] getMatrizBidimensional() {
		return matriz1;
	}

	public void setMatrizBidimensional(double[][] matriz1) {
		this.matriz1 = matriz1;
	}
	
}
