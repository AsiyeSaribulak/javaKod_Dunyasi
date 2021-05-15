package MusteriYonetim_Sistemi.Abstract;

import MusteriYonetim_Sistemi.Entities.Customer;

public interface CustomerCheckService {
      boolean CheckIfRealPerson(Customer customer);
}
