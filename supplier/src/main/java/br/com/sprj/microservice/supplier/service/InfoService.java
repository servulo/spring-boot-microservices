package br.com.sprj.microservice.supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sprj.microservice.supplier.model.SupplierInfo;
import br.com.sprj.microservice.supplier.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;

	public SupplierInfo getInfoByState(String state) {
		return infoRepository.findByState(state);
	}

}