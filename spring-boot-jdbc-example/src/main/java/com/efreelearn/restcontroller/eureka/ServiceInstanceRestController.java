package com.efreelearn.restcontroller.eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
public class ServiceInstanceRestController {
	@Autowired 
	DiscoveryClient discoveryClient;
	@RequestMapping("/service-instances/{applicationName}")
public List<ServiceInstance> serviceInstanceApplicationByClientName(@PathVariable String applicationname)
{

	this.discoveryClient.getServices().forEach(System.out::println);
	
	return this.discoveryClient.getInstances(applicationname);

}
	@RequestMapping("/service-instances-all")
public List<ServiceInstance> serviceInstanceApplicationAll()
{

	this.discoveryClient.getServices().forEach(System.out::println);
	
	return this.discoveryClient.getInstances("booknew");

}
}
