package MusteriYonetim_Sistemi.Concrete;

import MusteriYonetim_Sistemi.Abstract.BaseCustomerManager;
import MusteriYonetim_Sistemi.Abstract.CustomerCheckService;
import MusteriYonetim_Sistemi.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	private CustomerCheckService CustomerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		CustomerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(this.CustomerCheckService.CheckIfRealPerson(customer))
		{
		super.Save(customer);
		}
		else
		{
			System.out.println("Geçerli bir kiþi deðil");

		}
	}

	

}
