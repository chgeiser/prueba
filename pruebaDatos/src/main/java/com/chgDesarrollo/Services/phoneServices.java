package com.chgDesarrollo.Services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.chgDesarrollo.Model.Phone;
import com.chgDesarrollo.Repository.PhoneRepository;


public class phoneServices implements PhoneRepository{

	@Autowired
	private PhoneRepository PhoneRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Phone> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Phone> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Phone getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return PhoneRepository.findAll(example);
	}

	@Override
	public <S extends Phone> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> findAll() {
		// TODO Auto-generated method stub
		return PhoneRepository.findAll();
	}

	@Override
	public List<Phone> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return PhoneRepository.findAllById(ids);
	}

	@Override
	public <S extends Phone> S save(S entity) {
		// TODO Auto-generated method stub
		return PhoneRepository.save(entity);
	}

	@Override
	public Optional<Phone> findById(Long id) {
		// TODO Auto-generated method stub
		return PhoneRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		PhoneRepository.deleteById(id);

	}

	@Override
	public void delete(Phone entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Phone> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Phone> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return PhoneRepository.findAll();
	}

	@Override
	public Page<Phone> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Phone> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Phone> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Phone, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}



}
