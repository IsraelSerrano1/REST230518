package com.softtek.restback1.repository;

import com.softtek.restback1.modelo.Medico;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@NoArgsConstructor
public class MedicoRepoImpl implements IMedicoRepo{
    @Override
    public List<Medico> listar() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(1,"12343546A","Hector", 35));
        medicos.add(new Medico(2,"12343546B", "Juan", 56));
        medicos.add(new Medico(3,"12343546C", "Paco", 62));
        return medicos;
        }
}
