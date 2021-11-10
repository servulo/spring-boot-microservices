package br.com.sprj.microservice.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprj.microservice.store.dto.PurchaseDTO;
import br.com.sprj.microservice.store.model.Purchase;
import br.com.sprj.microservice.store.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping(method = RequestMethod.POST)
	public Purchase makePurchase(@RequestBody PurchaseDTO purchaseDTO) {
		return purchaseService.makePurchase(purchaseDTO);
	}

}