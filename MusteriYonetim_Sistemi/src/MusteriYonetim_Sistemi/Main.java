package MusteriYonetim_Sistemi;

import MusteriYonetim_Sistemi.Abstract.BaseCustomerManager;
import MusteriYonetim_Sistemi.Adapters.MernisServiceAdapter;
import MusteriYonetim_Sistemi.Concrete.NeroCustomerManager;
import MusteriYonetim_Sistemi.Concrete.StarbucksCustomerManager;
import MusteriYonetim_Sistemi.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Asiye", "SARIBULAK", 2001, "27896262732"));
		
		
	}

}
