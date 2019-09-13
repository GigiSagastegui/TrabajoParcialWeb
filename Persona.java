package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="personas")
public class Persona implements Serializable  {

	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idJefe;
		@Column(name="nombrePersona",nullable=false,length=50)
		private String nombrePersona;
		@Column(name="edadPersona",nullable=false,length=50)
		private String edadPersona;
		@Column(name="telefPersona",nullable=false,length=50)
		private String telefPersona;
		@Column(name="fechaNacimPersona",nullable=false,length=50)
		private String fechaNacimPersona;
		@Column(name="emailPersona",nullable=false,length=50)
		private String emailPersona;
		public Persona() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Persona(int idJefe, String nombrePersona, String edadPersona, String telefPersona,
				String fechaNacimPersona, String emailPersona) {
			super();
			this.idJefe = idJefe;
			this.nombrePersona = nombrePersona;
			this.edadPersona = edadPersona;
			this.telefPersona = telefPersona;
			this.fechaNacimPersona = fechaNacimPersona;
			this.emailPersona = emailPersona;
		}
		public int getIdJefe() {
			return idJefe;
		}
		public void setIdJefe(int idJefe) {
			this.idJefe = idJefe;
		}
		public String getNombrePersona() {
			return nombrePersona;
		}
		public void setNombrePersona(String nombrePersona) {
			this.nombrePersona = nombrePersona;
		}
		public String getEdadPersona() {
			return edadPersona;
		}
		public void setEdadPersona(String edadPersona) {
			this.edadPersona = edadPersona;
		}
		public String getTelefPersona() {
			return telefPersona;
		}
		public void setTelefPersona(String telefPersona) {
			this.telefPersona = telefPersona;
		}
		public String getFechaNacimPersona() {
			return fechaNacimPersona;
		}
		public void setFechaNacimPersona(String fechaNacimPersona) {
			this.fechaNacimPersona = fechaNacimPersona;
		}
		public String getEmailPersona() {
			return emailPersona;
		}
		public void setEmailPersona(String emailPersona) {
			this.emailPersona = emailPersona;
		}
		

}
