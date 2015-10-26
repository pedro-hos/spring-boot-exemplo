package br.com.gauge.model.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.gauge.model.dto.ErrorDTO;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<ErrorDTO> handle(Exception e) {
		final ErrorDTO errorDTO = new ErrorDTO(e.getMessage());
		return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
