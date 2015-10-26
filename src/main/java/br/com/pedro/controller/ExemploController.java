package br.com.pedro.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedro.model.dto.ExemploDTO;

@RestController
@RequestMapping("/exemplo")
public class ExemploController {
	
	@RequestMapping( value = "/hello/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody ExemploDTO helloJson() {
		return new ExemploDTO("Hello World");
	}

}
