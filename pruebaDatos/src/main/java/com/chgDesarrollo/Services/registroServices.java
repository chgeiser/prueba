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
import org.springframework.stereotype.Service;

import com.chgDesarrollo.Model.DatosCRUID;
import com.chgDesarrollo.Repository.DatosCRUIDRepository;

@Service
public class registroServices implements  DatosCRUIDRepository{

    @Autowired
    private DatosCRUIDRepository DatosCRUIDRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends DatosCRUID> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<DatosCRUID> entities) {
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
	public DatosCRUID getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosCRUID getById(Long id) {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.getById(id);
	}

	@Override
	public DatosCRUID getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DatosCRUID> findAll() {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.findAll();
	}

	@Override
	public List<DatosCRUID> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.findAllById(ids);
	}

	@Override
	public <S extends DatosCRUID> S save(S entity) {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.save(entity);
	}

	@Override
	public Optional<DatosCRUID> findById(Long id) {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.findById(id);
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
		DatosCRUIDRepository.deleteById(id);
	}

	@Override
	public void delete(DatosCRUID entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends DatosCRUID> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DatosCRUID> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return DatosCRUIDRepository.findAll(sort);
	}

	@Override
	public Page<DatosCRUID> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends DatosCRUID> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DatosCRUID> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends DatosCRUID> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends DatosCRUID, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


}
