package br.com.sprj.microservice.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.sprj.microservice.store.SupplierClient;
import br.com.sprj.microservice.store.dto.PurchaseDTO;
import br.com.sprj.microservice.store.dto.SupplierDTO;

@Service
@SuppressWarnings("unused")
public class PurchaseService {

	@Autowired
	private SupplierClient supplierClient;

	public void makePurchase(PurchaseDTO purchaseDTO) {

		SupplierDTO infoByState = supplierClient.getInfoByState(purchaseDTO.getAddress().getState());
		
		System.out.println(infoByState.getAddress());

	}

}