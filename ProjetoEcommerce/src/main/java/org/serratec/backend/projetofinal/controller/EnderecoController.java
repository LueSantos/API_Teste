package org.serratec.backend.projetofinal.controller;

import org.serratec.backend.projetofinal.dto.EnderecoDTO;
import org.serratec.backend.projetofinal.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	/*
	@GetMapping("{cep}")
	@ApiOperation(value = "Listar Endereços", notes = "Listar Endereços")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Endereços listadas com sucesso"),
			@ApiResponse(code = 401, message = "Erro de autenticação"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar o recurso"),
			@ApiResponse(code = 404, message = "Recurso Indisponivel"),
			@ApiResponse(code = 500, message = "Erros interno do servidor"),
			@ApiResponse(code = 505, message = "Ocorreu uma exceção") })
	public ResponseEntity<EnderecoDTO> buscar(@PathVariable String cep){
		
		EnderecoDTO enderecoDTO = enderecoService.buscarCep(cep);
		
		if(enderecoDTO == null) {
			
			return ResponseEntity.notFound().build();
			
		} else {
			
			return ResponseEntity.ok(enderecoDTO);
			
		}
	}
	*/

	
	
}
