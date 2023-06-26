package visitor.application.model;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visitor {

	@Column(name = "visitorId")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int visitorId;
	private String visitorName;
	private double visitorPhoneNumber; 
	private String visitorAdress;
	private String visitorsVisitingPurpose;
	
	@Temporal(TemporalType.DATE)
	private Date DATE = new Date(System.currentTimeMillis());
}
