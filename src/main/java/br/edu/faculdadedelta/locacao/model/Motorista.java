package br.edu.faculdadedelta.locacao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.edu.faculdadedelta.locacao.modelo.types.Sexo;

@Entity
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O campo nome é obrigatório!")
	private String nome;

	@NotBlank(message = "O campo CPF é obrigatório!")
	private String cpf;

	@NotBlank(message = "O campo CNH é obrigatório!")
	private String cnh;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "O campo sexo é obrigatório!")
	private Sexo sexo;

	public Motorista() {
		super();
	}

	public Motorista(Long id, String nome, String cpf, String cnh, Sexo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
