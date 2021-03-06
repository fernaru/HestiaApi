package com.co.kerbero.hestia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="menu")
public class MenuOli implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String modulo;
	
	@NotEmpty
	private String descricion;
	
	@NotEmpty
	@Size(min=10)
	@Column(nullable=false)
	private String url;
	
	@NotEmpty
	@Column(nullable=false)
	private Long id_padre;
	
	@NotEmpty
	private int typeUsuario;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getId_padre() {
		return id_padre;
	}

	public void setId_padre(Long id_padre) {
		this.id_padre = id_padre;
	}

	public int getTypeUsuario() {
		return typeUsuario;
	}

	public void setTypeUsuario(int typeUsuario) {
		this.typeUsuario = typeUsuario;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
