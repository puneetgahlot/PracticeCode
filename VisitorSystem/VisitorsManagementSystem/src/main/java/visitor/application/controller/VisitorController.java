package visitor.application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import visitor.application.model.Visitor;
import visitor.application.service.VisitorService;

@RestController
@RequestMapping("/visitors")
@Slf4j
public class VisitorController {
	
	@Autowired
	VisitorService visitorService;
	
	@PostMapping("/")
	public Visitor addNewVisitor(@RequestBody Visitor visitor) {
		log.info("Inside addNewVisitor method of Visitor Controller");
		return visitorService.saveVisitor(visitor);		
	}
	
	@GetMapping("/")
	public List<Visitor> getAllVisitors() {
		log.info("Inside getAllVisitors method of Visitor Controller");
		return visitorService.getVisitor();		
	}
	
	@GetMapping("/{id}")
	public Visitor getVisitorById(@PathVariable("visitorId") int visitorId) {
		log.info("Inside getVisitorById method of Visitor Controller");
		return visitorService.getVisitorById(visitorId);		
	}
	
	@GetMapping("/number")
	public List<Visitor> getVisitorByphoneNumber(@RequestParam("phoneNumber") double phoneNumber) {
		log.info("Inside getVisitorByphoneNumber method of Visitor Controller");
		return visitorService.getVisitorByphoneNumber(number);		
	}
	
	@GetMapping("/date")
	public List<Visitor> getVisitorByDate(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date DATE) {
		log.info("Inside getVisitorByDate method of Visitor Controller");
		return visitorService.getVisitorByDate(DATE);		
	}
	
	@PutMapping("/")
	public Visitor updateVisitor(@RequestBody Visitor visitor) {
		log.info("Inside updateVisitor method of Visitor Controller");
		return visitorService.updateVisitor(visitor);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteVisitor(@PathVariable("visitorId") int visitorId) {
		log.info("Inside deleteVisitor method of Visitor Controller");
		visitorService.deleteVisitor(visitorId);		
	}

}
