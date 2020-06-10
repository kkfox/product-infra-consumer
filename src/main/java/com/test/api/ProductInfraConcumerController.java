package com.test.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductInfraConcumerController {
	@Autowired
	private PropertyClient propertyClient;

	@GetMapping("properties")
	public List<String> getProductProperties() {

		return propertyClient.getProperties();

	}

}
