package ws;

import java.util.List;

/*
 * JAX-WS
 */
public class ClientWS {

	public static void main(String[] args) {
		BanqueService stub = new BanqueWS().getBanqueServicePort();
		System.out.println(stub.conversionEuroToDH(34));
		
		Compte compte = stub.getCompte(3);
		System.out.println("Code = "+compte.getCode() +
				"\nSolde= "+ compte.getSolde());
		
		List<Compte> comptes = stub.listComptes();
		System.out.println("---------------------");
		for (Compte cp: comptes) {
			System.out.println("Code = "+cp.getCode() +
					"\nSolde= "+ cp.getSolde());
		}
	}
}
