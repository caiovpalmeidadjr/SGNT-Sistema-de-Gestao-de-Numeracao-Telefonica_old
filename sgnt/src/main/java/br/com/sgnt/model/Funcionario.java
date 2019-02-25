package br.com.sgnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FUNCIONARIO")
public class Funcionario {

	// referenciando que matricula é um id na tabela funcionario e que o id da mesma
	// será gerado automaticamente
	@Id
	@GeneratedValue
	@Column(name = "MATR_FUNC")
	private Integer matriculaFunc;

	@Column(name = "NOME_FUNC")
	private String nomeFunc;

	@Column(name = "TELE_FUNC")
	private String telefoneFunc;

	@Column(name = "EMAIL_FUNC")
	private String emailFunc;

	public Integer getMatriculaFunc() {
		return matriculaFunc;
	}

	public void setMatriculaFunc(Integer matriculaFunc) {
		this.matriculaFunc = matriculaFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getTelefoneFunc() {
		return telefoneFunc;
	}

	public void setTelefoneFunc(String telefoneFunc) {
		this.telefoneFunc = telefoneFunc;
	}

	public String getEmailFunc() {
		return emailFunc;
	}

	public void setEmailFunc(String emailFunc) {
		this.emailFunc = emailFunc;
	}

}
