package com.lp2sebastiansanca.interfaceService;

import java.util.List;
import java.util.Optional;

import com.lp2sebastiansanca.modelo.Empleado;

public interface IEmpleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int Id);
	public int save(Empleado e);
	public void delete(int id);
}
