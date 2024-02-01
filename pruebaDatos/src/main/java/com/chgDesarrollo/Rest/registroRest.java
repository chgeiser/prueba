package com.chgDesarrollo.Rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chgDesarrollo.Model.DatosCRUID;
import com.chgDesarrollo.Services.registroServices;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/registros/")
public class registroRest {

	@Autowired
    private registroServices registroService;


	@GetMapping
	private ResponseEntity<List<DatosCRUID>> getFindAll(){
		return ResponseEntity.ok(registroService.findAll());
	}

	@PostMapping
	private ResponseEntity<DatosCRUID> saveDatos(@RequestBody DatosCRUID datos){
		try {
			DatosCRUID guardarDatos = registroService.save(datos);
			return ResponseEntity.created(new URI("/registros/datos/" + guardarDatos.getId())).body(guardarDatos);
		}catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDatos(@PathVariable ("id") Long id){
		registroService.deleteById(id);
		return ResponseEntity.ok(!(registroService.findById(id)!= null));
	}

}
