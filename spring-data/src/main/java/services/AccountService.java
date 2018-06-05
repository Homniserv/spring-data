package services;

import java.util.List;

import entity.Account;
import entity.Customer;

public interface AccountService {

	Account save(Account account);

	List<Account> findByCustomer(Customer customer);

}
