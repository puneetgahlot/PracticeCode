package visitor.application.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import visitor.application.model.Visitor;
import visitor.application.repository.VisitorRepository;

@Slf4j
@Component
public class VisitorService {

	@Autowired
	VisitorRepository visitorRepository;

	public Visitor addNewVisitor(Visitor visitor) {
		log.info("Inside addNewVisitor method of Visitor Service");
		return visitorRepository.save(visitor);
	}

	public List<Visitor> getAllVisitors() {
		log.info("Inside getAllVisitors method of Visitor Service");
		List<Visitor> list = visitorRepository.findAll();		
		return list;
	}

	public Visitor getVisitorById(int id) {
		log.info("Inside getVisitorById method of Visitor Service");
		return visitorRepository.findById(id).get();
	}

	public List<Visitor> getVisitorByphoneNumber(double number) {
		log.info("Inside getVisitorByphoneNumber method of Visitor Service");
		return visitorRepository.findByVisitorPhoneNumber(number);
	}

	public List<Visitor> getVisitorByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date DATE) {
		log.info("Inside getVisitorByDate method of Visitor Service");
		return visitorRepository.findByDate(DATE);
	}

	public Visitor updateVisitor(Visitor visitor) {
		log.info("Inside updateVisitor method of Visitor Service");
		return visitorRepository.save(visitor);
	}

	public void deleteVisitor(int visitorId) {
		log.info("Inside deleteVisitor method of Visitor Service");
		visitorRepository.deletedById(visitorId);
	}
}
