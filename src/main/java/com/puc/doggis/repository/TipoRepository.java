package com.puc.doggis.repository;

import com.puc.doggis.entity.Pet;
import com.puc.doggis.entity.TipoPet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<TipoPet, Long> {
}
