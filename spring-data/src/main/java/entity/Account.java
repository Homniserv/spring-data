package entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.hibernate.annotations.Entity;

/**https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa/*/
@Entity
public class Account {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Customer customer;

	@Temporal(TemporalType.DATE)
	private Date expiryDate;

	// … methods omitted
}