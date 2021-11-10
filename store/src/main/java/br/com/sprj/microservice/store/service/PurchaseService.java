package br.com.sprj.microservice.store.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sprj.microservice.dto.OrderInfoDTO;
import br.com.sprj.microservice.store.SupplierClient;
import br.com.sprj.microservice.store.dto.PurchaseDTO;
import br.com.sprj.microservice.store.dto.SupplierDTO;
import br.com.sprj.microservice.store.model.Purchase;

@Service
public class PurchaseService {
	
	private static final Logger LOG = LoggerFactory.getLogger(PurchaseService.class);

	@Autowired
	private SupplierClient supplierClient;

	public Purchase makePurchase(PurchaseDTO purchaseDTO) {
		
		LOG.info("PurchaseService => call getInfoByState");
		SupplierDTO infoByState = supplierClient.getInfoByState(purchaseDTO.getAddress().getState());
		
		LOG.info("PurchaseService => call makeOrder");
		OrderInfoDTO order = supplierClient.makeOrder(purchaseDTO.getItens());
		
		System.out.println(infoByState.getAddress());
		
		Purchase purchase = new Purchase();
		purchase.setOrderId(order.getId());
		purchase.setPreparatiomTime(order.getPreparationTime());
		purchase.setAddress(purchase.getAddress().toString());
		return purchase;
	}

}