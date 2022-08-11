package br.com.dev.marcus.consultadadoscompletoendereco.controller;

import br.com.dev.marcus.consultadadoscompletoendereco.dto.AddressCompleteResponse;
import br.com.dev.marcus.consultadadoscompletoendereco.services.ConsultaDadosCompletoEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/consultaendereco")
public class ConsultaDadosCompletoEnderecoController {

    @Autowired
    private ConsultaDadosCompletoEnderecoService servico;

    @GetMapping(value = "/{cep}")
    public ResponseEntity<String> findAddress(@PathVariable String cep){
        String mensagemRetorno = servico.findCep(cep);
        return ResponseEntity.ok().body(mensagemRetorno);
    }
}
