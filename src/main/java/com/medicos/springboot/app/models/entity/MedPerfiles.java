package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("deprecation")
@Entity
@Table(name = "mepeapp_perfiles")
public class MedPerfiles implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long per_me_id;
	@Column(name="medicos_perfiles_id")
	private Long Medicos_Perfil_Id;
	@Column(name="perfil_id")
    private Long EstudioId;
	public Long getPer_me_id() {
		return per_me_id;
	}
	public void setPer_me_id(Long per_me_id) {
		this.per_me_id = per_me_id;
	}
	public Long getMedicos_Perfil_Id() {
		return Medicos_Perfil_Id;
	}
	public void setMedicos_Perfil_Id(Long medicos_Perfil_Id) {
		Medicos_Perfil_Id = medicos_Perfil_Id;
	}
	public Long getEstudioId() {
		return EstudioId;
	}
	public void setEstudioId(Long estudioId) {
		EstudioId = estudioId;
	}
	
	
}
