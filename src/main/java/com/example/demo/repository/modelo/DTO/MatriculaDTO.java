package com.example.demo.repository.modelo.DTO;

import java.time.LocalDate;

public class MatriculaDTO {

	private String cedulaEstudiante;
	private String apellidoEstudiante;
	private String nombreMateria;
	private String codigoMateria;
	private LocalDate fechatMatricula;

	public MatriculaDTO(String cedulaEstudiante, String apellidoEstudiante, String nombreMateria, String codigoMateria,
			LocalDate fechatMatricula) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.apellidoEstudiante = apellidoEstudiante;
		this.nombreMateria = nombreMateria;
		this.codigoMateria = codigoMateria;
		this.fechatMatricula = fechatMatricula;
	}

	public MatriculaDTO() {

	}

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public LocalDate getFechatMatricula() {
		return fechatMatricula;
	}

	public void setFechatMatricula(LocalDate fechatMatricula) {
		this.fechatMatricula = fechatMatricula;
	}

}
