package br.com.sprj.microservice.store.dto;

import java.util.List;

public class PurchaseDTO {

	private List<PurchaseItemDTO> itens;

	private AddressDTO address;

	public List<PurchaseItemDTO> getItens() {
		return itens;
	}

	public void setItens(List<PurchaseItemDTO> itens) {
		this.itens = itens;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
	

}
