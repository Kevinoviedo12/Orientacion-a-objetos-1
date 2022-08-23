package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente3 = new Paciente ("Mario", "Faccone", 1.65f,105);
		Medico medico1 = new Medico("Martin", "Villalba","Traumatologo");

		System.out.println(paciente3.TraerNombreCompleto() + " tenia una masa corporal de: " + medico1.calcularIMC(paciente3));
		//System.out.println("Su peso era de: " + paciente3.getPeso());

		paciente3.setPeso(65);
		System.out.println("Medico: " + medico1.TraerNombreCompleto() );

		System.out.println("Pacientes: ");
		System.out.println(paciente3.TraerNombreCompleto() + " tiene una nueva masa corporal de: " + medico1.calcularIMC(paciente3));

	}

}
