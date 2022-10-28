package pojo;

import java.util.Date;

public class Vacina {
	
	private String nome;
	private Integer doses;
	private String dosesDescricao;
	private Date data;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getDoses() {
		return doses;
	}
	public void setDoses(Integer doses) {
		this.doses = doses;
	}
	public String getDosesDescricao() {
		return dosesDescricao;
	}
	public void setDosesDescricao(String dosesDescricao) {
		this.dosesDescricao = dosesDescricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
