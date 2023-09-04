package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence
                    .createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {
            // TODO: poderia ser logado com log4j
        }
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO() {
        this(null);
    }

    public DAO<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.abrirTransacao()
                .incluir(entidade)
                .fecharTransacao();
    }

    public List<E> obterTodos(int quantidade, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe nula");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(quantidade);
        query.setFirstResult(deslocamento);

        return query.getResultList();
    }

    public List<E> obterTodos() {
        return obterTodos(10, 0);
    }

    public E obterPorID(Object id) {
        return em.find(classe, id);
    }

    public void fechar() {
        em.close();
    }

}
