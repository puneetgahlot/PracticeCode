package visitor.application.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import visitor.application.model.Visitor;

public interface VisitorRepository extends CrudRepository<Visitor, Integer> {

	public List<Visitor> findByVisitorPhoneNumber(double phoneNumber);

	// @Query("select v from Visitor v WHERE date = :date")
	public List<Visitor> findByDate(Date DATE);
	// @Param("date");
}