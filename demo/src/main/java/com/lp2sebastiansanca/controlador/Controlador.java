package com.lp2sebastiansanca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lp2sebastiansanca.interfaceService.IEmpleadoService;
import com.lp2sebastiansanca.modelo.Empleado;


@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IEmpleadoService service;
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Empleado>empleados = service.listar();
        model.addAttribute("empleados",empleados);
        return "index";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model) {
        model.addAttribute("empleado",new Empleado());
        return "insertar";
    }
    @PostMapping("/save")
    public String save(@Validated Empleado e , Model model) {
        service.save(e);
        return "redirect:/listar";
    }
}
