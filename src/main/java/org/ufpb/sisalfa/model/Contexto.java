package org.ufpb.sisalfa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "contexto") 
public class Contexto extends AbstractEntity {
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String imagem;
	@Column(nullable = false)
	private String som;
	@Column(nullable = false) 
	private String video;
	@JoinColumn(nullable=false)
	@OneToOne(cascade={CascadeType.PERSIST},fetch=FetchType.LAZY)
	private Usuario usuario;
	@Column(nullable = false) 
	private Long idUsuario;
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return this.nome;
	}

}
