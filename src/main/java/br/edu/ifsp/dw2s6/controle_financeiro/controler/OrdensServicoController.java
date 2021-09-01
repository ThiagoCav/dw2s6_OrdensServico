package br.edu.ifsp.dw2s6.controle_financeiro.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.dw2s6.controle_financeiro.model.Cliente;


@RestController
public class OrdensServicoController {
	
	@GetMapping("/cliente")
	public List<Cliente> listar(){
		
		var cliente1 = new Cliente();
		cliente1.setCodigo(1l);
		cliente1.setNome("Thiago");
		cliente1.setEmail("thiagocavallari@outlook.com");
		cliente1.setTelefone("16997911997");
		
		var cliente2 = new Cliente();
		cliente2.setCodigo(1l);
		cliente2.setNome("Joao");
		cliente2.setEmail("Joao@outlook.com");
		cliente2.setTelefone("1231231231");
		
		var cliente3 = new Cliente();
		cliente3.setCodigo(1l);
		cliente3.setNome("Maria");
		cliente3.setEmail("Maria@outlook.com");
		cliente3.setTelefone("456456456");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
		
	}

}
	
