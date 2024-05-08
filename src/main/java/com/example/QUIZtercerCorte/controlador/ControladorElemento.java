package com.example.QUIZtercerCorte.controlador;

import com.example.QUIZtercerCorte.operaciones.OperacionesElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControladorElemento {
    @Autowired
    OperacionesElemento operacionesElemento;

    @GetMapping({"/elemento","/"})
    public String listarElementoALE(Model modelo) {
        modelo.addAttribute("Elementos",operacionesElemento.listar());
        return "elementosALimenticios";
    }
}