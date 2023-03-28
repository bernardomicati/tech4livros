package org.serratec.java02backend.projeto06.dto;

import java.util.Date;

public class LivroDto {
	
	private String titulo;
	private String genero;
	private String autor;
	private Date dataPublicacao;
	private Long idLivro;
	
	public LivroDto() {}

	public LivroDto(String titulo, String genero, String autor, Date dataPublicacao, Long idLivro) {
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.idLivro = idLivro;
	}
	public Long getId(){
		return idLivro;
	}
	public Long setId(Long idLivro){
		return idLivro;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

}