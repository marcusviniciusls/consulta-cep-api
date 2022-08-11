package br.com.dev.marcus.consultadadoscompletoendereco.services;

import br.com.dev.marcus.consultadadoscompletoendereco.dto.AddressCompleteResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaDadosCompletoEnderecoService {

    public String findCep(String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        RestTemplate restTemplate = new RestTemplate();
        String retorno = restTemplate.getForObject(url, String.class);
        return retorno;
    }
}
