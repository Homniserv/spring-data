package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Account;
import entity.Customer;

@Repository
@Transactional(readOnly = true)
class AccountServiceImpl implements AccountService {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public Account save(Account account) {

		if (account.getId() == null) {
			em.persist(account);
			return account;
		} else {
			return em.merge(account);
		}
	}

	@Override
	public List<Account> findByCustomer(Customer customer) {

		TypedQuery query = em.createQuery("select a from Account a where a.customer = ?1", Account.class);
		query.setParameter(1, customer);

		return query.getResultList();
	}
}