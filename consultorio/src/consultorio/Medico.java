package consultorio;

//import consultorio.Paciente;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	
	//constructor
	public Medico(String nombre, String apellido, String especialidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	//metodos setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public float calcularIMC(Paciente paciente) {
		float pacienteIMC = 0;
		pacienteIMC = (paciente.getPeso() / (paciente.getEstatura()) * 2);
		
		return pacienteIMC;
	}
	public String TraerNombreCompleto() {
		String resultado = nombre + " " + apellido;
		return resultado;
	}
	
}
