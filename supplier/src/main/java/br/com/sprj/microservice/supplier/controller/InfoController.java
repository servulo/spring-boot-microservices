package br.com.sprj.microservice.supplier.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprj.microservice.supplier.model.SupplierInfo;
import br.com.sprj.microservice.supplier.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);

	@Autowired
	private InfoService infoService;

	@RequestMapping("/{state}")
	public SupplierInfo getInfoByState(@PathVariable String state) {
		LOG.info("InfoController => getInfoByState");
		return infoService.getInfoByState(state);
	}

}