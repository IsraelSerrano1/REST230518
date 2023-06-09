package com.softtek.restback1.servicio;

import com.softtek.restback1.modelo.Medico;
import com.softtek.restback1.repository.IMedicoRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicoServicioImpl implements IMedicoServicio{
    @Autowired
    IMedicoRepo repo;
    @Override
    public List<Medico> listar() {
        return repo.listar();
    }
}
