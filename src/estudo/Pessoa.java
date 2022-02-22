package estudo;

public class Pessoa {

	
	private String nome;
	
	public int idade;
	
	private String cor;
	
	private String cpf;
	
	
	private Endereco endereco;
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public Pessoa(String nome, String cor, String cpf, int idade) {
		
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.cpf = cpf;
	
	}
	
	
	public Pessoa() {
		
		
	}
	
	public void cadastrar(){
		
		
		
		System.out.println("BEM VINDO AO SISTEMA!!");
		
		
		
		
		
	}

	
	
	
	
}
