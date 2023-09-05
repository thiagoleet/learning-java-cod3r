package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();


        Usuario usuario = em.find(Usuario.class, 2L);

        if(usuario != null) {
            em.getTransaction().begin();

            System.out.println(usuario.getNome());
            System.out.println(usuario.getEmail());

            em.remove(usuario);

            em.getTransaction().commit();
        }



        em.close();
        emf.close();

    }
}
