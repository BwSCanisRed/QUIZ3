package com.example.QUIZtercerCorte.servicios;

import com.example.QUIZtercerCorte.Entidad.ElementosAlimenticios;
import com.example.QUIZtercerCorte.operaciones.OperacionesElemento;
import com.example.QUIZtercerCorte.repositorios.RepositorioElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioElemento implements OperacionesElemento {

    @Autowired
    RepositorioElemento repositorioElemento;

    @Override
    public List<ElementosAlimenticios> listar() {
        return repositorioElemento.findAll();
    }

}