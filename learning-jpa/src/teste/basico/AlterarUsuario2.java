package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 2L);
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());

        usuario.setNome("Ze das Couve (alterado)");
        usuario.setEmail("ze.das@couve.com.br");

        // em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
