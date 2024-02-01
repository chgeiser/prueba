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

import com.chgDesarrollo.Model.Phone;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/phone/")
public class phoneRest {

	@Autowired
	private com.chgDesarrollo.Services.phoneServices phoneServices;

	@GetMapping
	private ResponseEntity<List<Phone>> getAllPhone(){
		return ResponseEntity.ok(phoneServices.findAll());
	}

	@PostMapping
	private ResponseEntity<Phone> getSavePhone(@RequestBody Phone phone){
		try {
			Phone guardarPhone = phoneServices.save(phone);
			return ResponseEntity.created(new URI ("/phone/" + guardarPhone.getId())).body(guardarPhone);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePhone (@PathVariable ("id") Long id){
		phoneServices.deleteById(id);
		return ResponseEntity.ok(!(phoneServices.findById(id)!=null));

	}

}
