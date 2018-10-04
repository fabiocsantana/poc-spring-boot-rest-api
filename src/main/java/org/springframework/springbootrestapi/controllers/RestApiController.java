package org.springframework.springbootrestapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.springbootrestapi.models.MyEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	@PostMapping(value = "/entity", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> doPost(@RequestBody MyEntity entity) {
		return new ResponseEntity<MyEntity>(entity, HttpStatus.CREATED);
	}
}