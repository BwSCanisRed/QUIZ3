package com.example.QUIZtercerCorte.repositorios;

import com.example.QUIZtercerCorte.Entidad.ElementosAlimenticios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioElemento  extends JpaRepository<ElementosAlimenticios, Long> {
}