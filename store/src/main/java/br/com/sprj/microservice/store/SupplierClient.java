package br.com.sprj.microservice.store;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sprj.microservice.dto.OrderInfoDTO;
import br.com.sprj.microservice.store.dto.PurchaseItemDTO;
import br.com.sprj.microservice.store.dto.SupplierDTO;

@FeignClient("supplier")
public interface SupplierClient {

	@RequestMapping("/info/{state}")
	SupplierDTO getInfoByState(@PathVariable String state);

	@RequestMapping(method = RequestMethod.POST, value = "/order")
	OrderInfoDTO makeOrder(List<PurchaseItemDTO> itens);

}
