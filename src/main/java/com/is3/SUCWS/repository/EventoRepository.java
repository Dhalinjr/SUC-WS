package com.is3.SUCWS.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.is3.SUCWS.entity.Evento;


@Repository("repoevento")
public interface EventoRepository extends JpaRepository <Evento, Serializable>{
	
	
   public abstract Evento findByIdevento (int IdEvento);

}
