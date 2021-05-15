package MusteriYonetim_Sistemi.Abstract;

import MusteriYonetim_Sistemi.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.getFirstName());
	}

}
