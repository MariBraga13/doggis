package com.puc.doggis.controller;

import com.puc.doggis.entity.Cliente;
import com.puc.doggis.entity.Pet;
import com.puc.doggis.entity.Raca;
import com.puc.doggis.entity.TipoPet;
import com.puc.doggis.repository.ClienteRepository;
import com.puc.doggis.repository.PetRepository;
import com.puc.doggis.repository.RacaRepository;
import com.puc.doggis.repository.TipoRepository;
import com.puc.doggis.vo.PetVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/pets")
public class PetController {

    private PetRepository petRepository;
    private TipoRepository tipoRepository;
    private RacaRepository racaRepository;
    private ClienteRepository clienteRepository;

    @Autowired
    public PetController(PetRepository petRepository, TipoRepository tipoRepository, RacaRepository racaRepository,
                         ClienteRepository clienteRepository) {
        this.petRepository = petRepository;
        this.tipoRepository = tipoRepository;
        this.racaRepository = racaRepository;
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    @GetMapping("/{nome}")
    public List<Pet> getPetsByName(@PathParam("nome") String nome) {
        return petRepository.findByNome(nome);
    }

    @GetMapping(path = "/tipos")
    @ResponseBody
    public List<TipoPet> getTipos() {
        return tipoRepository.findAll();
    }

    @GetMapping(path = "/racas/{tipo}")
    @ResponseBody
    public List<Raca> getRacas(@PathVariable("tipo") Long tipo) {
        return racaRepository.findByTipoPetId(tipo);
    }

    @PostMapping("/novo")
    public ResponseEntity salvarPet(@RequestBody PetVO vo) {
        Raca raca = racaRepository.findById(vo.getIdRaca()).get();
        Cliente cliente = clienteRepository.findById(vo.getIdCliente()).get();

        Pet pet = new Pet(raca, cliente, vo.getNome(), vo.getPorte(), vo.getHabitos(), vo.getAlergias(),
                vo.getPublicacaoFotos());

        petRepository.save(pet);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{petId}")
    public ResponseEntity deletarPet(@PathVariable("petId") Long petId) {
        petRepository.deleteById(petId);
        return ResponseEntity.ok().build();
    }
}
