package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente ("Jose", "Oviedo", 1.60f,85);
		Paciente paciente2 = new Paciente ("Mario", "Faccone", 1.65f,105);
		
		Medico medico1 = new Medico("Martin", "Villalba","Traumatologo");

		System.out.println("Pacientes: ");
		System.out.println(paciente1.TraerNombreCompleto() + " tiene una masa corporal de: " + medico1.calcularIMC(paciente1));
		System.out.println(paciente2.TraerNombreCompleto() + " tiene una masa corporal de: " + medico1.calcularIMC(paciente2));
		
		
	}

}
