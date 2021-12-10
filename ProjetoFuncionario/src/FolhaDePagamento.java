import nucleo.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		/*
		 * f1 = new Funcionario(); f2 = new Funcionario(); f3 = new Funcionario();
		 * f1.setNumeroFuncional(246924); f1.setNome("Alex junio");
		 * f1.setCargo("Economista de esforço"); f1.setSalario(24000);
		 * f2.setNumeroFuncional(362488); f2.setNome("Vanderlei");
		 * f2.setCargo("Chefe de cozinha"); f2.setSalario(1928);
		 * f3.setNumeroFuncional(282532); f3.setNome("Janete"); f3.setCargo("zeladora");
		 * f3.setSalario(1410);
		 */
		f1 = new Funcionario(246924, "Alex junio", "economista de esforço", 24000);
		f2 = new Funcionario(122334, "vanderlei", "chefe de cozinha", 22928);
		f3 = new Funcionario(282532, "Janete", "zeladora", 1410);
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		f1.aumentarSalario(10);
		f1.mostrarDados();

	}
}
