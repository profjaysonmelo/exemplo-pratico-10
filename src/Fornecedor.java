
public class Fornecedor extends Parceiro {

	private String razaoSocial;
	private String ie;
	private String cnpj;
	
	public Fornecedor(int codigo, String nome, String email, String razaoSocial, String cnpj) {
		super.setCodigo(codigo);
		super.setNome(nome);
		super.setEmail(email);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String imprimir() {
		return super.imprimir() 
			+ "\nRaz�o Social: " + razaoSocial + "\nCNPJ: " + cnpj;
	}
	
	public void adicionarBonus() {
		this.setBonusDeCompra(this.getBonusDeCompra() + 3);
	}
}
