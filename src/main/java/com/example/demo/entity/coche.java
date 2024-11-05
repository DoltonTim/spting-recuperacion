package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "coche")
public class coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "placa", length = 100)
	private String placa;
	@Column(name = "puertas", length = 100)
	private String puertas;
	 
	@ManyToOne
    @JoinColumn(name = "id_marca", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private marca marca; // Esto crea una relación con la entidad Marca

	 
	@ManyToOne
    @JoinColumn(name = "id_tipocoche", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private tipocoche tipocoche; // Esto crea una relación con la entidad Marca

}
