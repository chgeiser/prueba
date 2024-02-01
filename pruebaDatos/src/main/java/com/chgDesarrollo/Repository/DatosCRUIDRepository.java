package com.chgDesarrollo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chgDesarrollo.Model.DatosCRUID;

@Repository
public interface DatosCRUIDRepository extends JpaRepository<DatosCRUID, Long> {

}
