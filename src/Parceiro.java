
public class Parceiro {

	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private int bonusDeCompra;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String imprimir() {
		return "Nome: " + nome + "\nEmail: " + email;
	}
	
	public int getBonusDeCompra() {
		return bonusDeCompra;
	}

	public void setBonusDeCompra(int bonusDeCompra) {
		this.bonusDeCompra = bonusDeCompra;
	}

	@Override
	public String toString() {
		return "UM RETORNO A MINHA ESCOLHA...";
	}
	
	public void adicionarBonus() {
		this.bonusDeCompra = this.bonusDeCompra + 6;
	}
}
