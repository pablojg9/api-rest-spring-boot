package com.project.api.rest.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String graduation;
    @NotNull
    private String typeLanguage;
    @NotNull
    private Integer cep;
    @NotNull
    @Min(value = 1, message = "Você não pode colocar menos que 1")
    @Max(value = 2, message = "Você não pode colocar mais que 2")
    private Integer age;

}
