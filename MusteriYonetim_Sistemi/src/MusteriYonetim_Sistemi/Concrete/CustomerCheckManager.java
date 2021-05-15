package MusteriYonetim_Sistemi.Concrete;

import MusteriYonetim_Sistemi.Abstract.CustomerCheckService;
import MusteriYonetim_Sistemi.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
