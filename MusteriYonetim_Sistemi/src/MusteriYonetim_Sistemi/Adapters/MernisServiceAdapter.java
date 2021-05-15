package MusteriYonetim_Sistemi.Adapters;

import java.rmi.RemoteException;

import MusteriYonetim_Sistemi.Abstract.CustomerCheckService;
import MusteriYonetim_Sistemi.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getTc()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthday());
		} catch (NumberFormatException e) {
			System.out.println("gerçek bir kiþi deðil");
		} catch (RemoteException e) {
			System.out.println("gerçek bir kiþi deðil");
		}
		return result;
	}
	

}
