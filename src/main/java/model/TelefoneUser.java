package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TelefoneUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false) //tornando obrigatorio informar
	private String numero;
	
	
	//Gravando telefone para o usuario
	@ManyToOne(optional = false,fetch = FetchType.EAGER)  //MUITOS TELEFONE PARA 1 USUARIO
	private UsuarioPessoa usuarioPessoa;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public UsuarioPessoa getUsuarioPessoa() {
		return usuarioPessoa;
	}


	public void setUsuarioPessoa(UsuarioPessoa usuarioPessoa) {
		this.usuarioPessoa = usuarioPessoa;
	}
	
	
	

}
