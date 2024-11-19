package com.example.PBRequest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rut; //Rut Cliente que solicita el préstamo
    private String type; //Tipo de préstamo
    private int amount; //Monto préstamo
    private float interest; //Tasa de interés anual
    private int time; //Plazo en años
    private int state; //Estado solicitud
}