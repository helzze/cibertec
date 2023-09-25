package com.lp2sebastiansanca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp2sebastiansanca.interfaceService.IEmpleadoService;
import com.lp2sebastiansanca.interfaces.IEmpleado;
import com.lp2sebastiansanca.modelo.Empleado;


@Service
public class EmpleadoService implements IEmpleadoService{

	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
