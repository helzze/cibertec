package com.lp2sebastiansanca.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lp2sebastiansanca.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {

}
