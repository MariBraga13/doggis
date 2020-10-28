package com.puc.doggis.repository;

import com.puc.doggis.entity.Cliente;
import com.puc.doggis.entity.Pet;
import com.puc.doggis.entity.Raca;
import com.puc.doggis.vo.PetVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByNome(String nome);

//    public void incluirPet(PetVO vo) {
//        Raca raca = racaRepository.findById(vo.getIdRaca()).get();
//        Cliente cliente = clienteRepository.findById(vo.getIdCliente()).get();
//
//        Pet pet = new Pet(raca, cliente, vo.getNome(), vo.getPorte(), vo.getHabitos(), vo.getAlergias(),
//                vo.getPublicacaoFotos());
//
//        petRepository.save(pet);
//    }
}
