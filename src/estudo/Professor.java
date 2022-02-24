package estudo;

public class Professor {

	
	private String nome;
	
	private int n_inscricao;

	private Materia materia;
	
	
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getN_inscricao() {
		return n_inscricao;
	}

	public void setN_inscricao(int n_inscricao) {
		this.n_inscricao = n_inscricao;
	}
	
	
	public Professor() {
		
		this.materia = new Materia();
	}
}
