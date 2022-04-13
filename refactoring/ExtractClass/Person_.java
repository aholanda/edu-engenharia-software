class Phone {
	private String DDD;
	private String no;
	private String ramal = null;

	Phone(String ddd, String no) {
		this.DDD = ddd;
		this.no = no;
	}

	Phone(String DDD, String no, String ramal) {
		this(DDD, no);
		this.ramal = ramal;
	}
	
	String getDDD() {
		return DDD;
	}

	String getNo() {
		return no;
	}

	String getRamal() {
		return ramal;
	}
}

public class Person_ {
	private String nome;
	private Phone phone;

	Person_(String nome, Phone phone) {
		this.nome = nome;
		this.phone = phone;
	}

	String getNome() {
		return this.nome;
	}
	
	Phone getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		String tail = "";
		String ramal = this.getPhone().getRamal(); 
		if (ramal != null) {
			tail = ", Ramal - " + ramal;
		}
		return this.nome + ", Tel:" + phone.getDDD() + " " + phone.getNo() + tail;
	}
}
