package br.com.sprj.microservice.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.sprj.microservice.store.dto.PurchaseDTO;
import br.com.sprj.microservice.store.dto.SupplierDTO;

@Service
public class PurchaseService {

	@Autowired
	private RestTemplate client;

	public void makePurchase(PurchaseDTO purchaseDTO) {
		ResponseEntity<SupplierDTO> exchange = client.exchange(
				"http://supplier/info/" + purchaseDTO.getAddress().getState(), HttpMethod.GET, null, SupplierDTO.class);
		
		System.out.println(exchange.getBody().getAddress());
		
	}

}