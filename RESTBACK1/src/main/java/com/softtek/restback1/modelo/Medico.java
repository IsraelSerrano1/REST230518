package com.softtek.restback1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {
    private int idMedico;
    private String dni;
    private String nombre;
    private int edad;
}
