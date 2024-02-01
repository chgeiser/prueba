package com.chgDesarrollo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chgDesarrollo.Model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
