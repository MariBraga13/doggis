package com.puc.doggis.repository;

import com.puc.doggis.entity.Raca;
import com.puc.doggis.entity.TipoPet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RacaRepository extends JpaRepository<Raca, Long> {

    List<Raca> findByTipoPetId(Long tipoPet);
}
