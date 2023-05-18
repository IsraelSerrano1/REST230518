package com.softtek.restback1.repository;

import com.softtek.restback1.modelo.Medico;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
@Repository
@NoArgsConstructor
public class MedicoRepoImpl implements IMedicoRepo{
    @Override
    public Medico[] listar() {
        Medico[] medicos = new Medico[3];
        medicos[0] = new Medico(1,"12343546A", "Hector", 35);
        medicos[1] = new Medico(2,"12343546B", "Juan", 56);
        medicos[2] = new Medico(3,"12343546C", "Paco", 62);

        return medicos;
        }
}
