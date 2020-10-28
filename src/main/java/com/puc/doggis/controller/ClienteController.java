package com.puc.doggis.controller;

import com.puc.doggis.entity.Cliente;
import com.puc.doggis.entity.Pet;
import com.puc.doggis.entity.Raca;
import com.puc.doggis.entity.TipoPet;
import com.puc.doggis.repository.ClienteRepository;
import com.puc.doggis.repository.PetRepository;
import com.puc.doggis.repository.RacaRepository;
import com.puc.doggis.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
}
