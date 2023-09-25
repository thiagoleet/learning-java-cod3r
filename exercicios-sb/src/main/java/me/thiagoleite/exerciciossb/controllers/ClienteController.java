package me.thiagoleite.exerciciossb.controllers;

import me.thiagoleite.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Pedro", "123.456.789-00");
    }

    @GetMapping
    public Cliente obterCliente(
            @RequestParam(name = "id") int id
    ) {
        return new Cliente(id, "Pedro", "123.456.789-00");
    }
}
