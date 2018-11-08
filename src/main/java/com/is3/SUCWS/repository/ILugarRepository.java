package com.is3.SUCWS.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.is3.SUCWS.entity.Lugar;

@Repository("repolugar")
public interface ILugarRepository extends JpaRepository<Lugar, Serializable> {

	public abstract Lugar findByNombre(String nombre);
}
