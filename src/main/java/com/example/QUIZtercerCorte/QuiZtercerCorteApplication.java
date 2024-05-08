package com.example.QUIZtercerCorte;

import com.example.QUIZtercerCorte.Entidad.ElementosAlimenticios;
import com.example.QUIZtercerCorte.repositorios.RepositorioElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuiZtercerCorteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuiZtercerCorteApplication.class, args);
		System.out.println("Cargado exitosamente");
	}

	@Autowired
	RepositorioElemento repositorioElemento;

	@Override
	public void run(String... args) throws Exception {
		ElementosAlimenticios elemento1 = new ElementosAlimenticios(11111,3500,"Pastas Doria",3,"Olimpica");
		repositorioElemento.save(elemento1);
	}
}
