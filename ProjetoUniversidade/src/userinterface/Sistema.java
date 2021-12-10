package userinterface;

import core.Estudante;
import core.Pessoa;

public class Sistema {
	public static void main(String[] args) {
		Pessoa p;
		Estudante e;

		p = new Pessoa("alex", "eu@eumesmo.com", "(01) 91234-4321");
		e = new Estudante("alex", "eu@eumesmo.com", "(01) 91234-4321", 1313, "java");

		p.imprimir();
		e.imprimir();

	}
}