package com.desafiobradesco.cadastroendereco.controller;

import com.desafiobradesco.cadastroendereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;
}
