package br.com.sprj.microservice.store;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sprj.microservice.store.dto.SupplierDTO;

@FeignClient("supplier")
public interface SupplierClient {
	
	@RequestMapping("/info/{state}")
	SupplierDTO getInfoByState(@PathVariable String state);

}
