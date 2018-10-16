import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Cliente clienteNumeroUm = new Cliente();

		clienteNumeroUm.setCodCliente(3);
		clienteNumeroUm.setNome("Joao");
		clienteNumeroUm.setEndereco("Rua julio de castilho");
		clienteNumeroUm.setCidade("sapucaia do sul");
		clienteNumeroUm.setCep("06776");
		clienteNumeroUm.setUf("RS");
		clienteNumeroUm.setIe("318533545");
		em.persist(clienteNumeroUm);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
