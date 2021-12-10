package core;

public class Estudante extends Pessoa {
	private int matricula;

	private String curso;

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Estudante(String nome, String email, String telefone, int matricula, String curso) {
		super(nome, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}

	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);

	}
}
