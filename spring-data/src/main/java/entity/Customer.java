package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

/**https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa/*/
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstname;
	private String lastname;

	// … methods omitted
}