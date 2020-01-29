package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestControllerDemoApplication {

	List<String> employees = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(RestControllerDemoApplication.class, args);
	}

	@RequestMapping(value = "/getList", method = RequestMethod.GET,  produces = "application/json")
	@ResponseBody
	public String getEmployeeList() {
		return employees.toString();
	}
	
	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET,  produces = "application/json")
	@ResponseBody
	public String getEmployeeName(@PathVariable String name) {
		return "Record available status = "+ employees.contains(name);
	}

	@RequestMapping(value = "/insert/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public String insertEmployeeName(@PathVariable String name) {
		employees.add(name);
		return "Inserted record "+ name;
	}

	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE,  produces = "application/json")
	@ResponseBody
	public String deleteEmployeeViaName(@PathVariable String name) {
		employees.remove(name);
		return "Deleted record "+ name;
	}

	@RequestMapping(value = "/getSecureList", method = RequestMethod.POST,  produces = "application/json")
	@ResponseBody
	public String getEmployeeListViaPostMethod() {
		return employees.toString();
	}
	
}
