/*
 * package bai.metier.idee.dao;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.PersistenceContext;
 * 
 * import bai.data.entite.Idee;
 * 
 * @Repository
 * 
 * @Transactional public class IdeeDao {
 * 
 * 
 * @PersistenceContext private EntityManager entityManager;
 * 
 * public void create(Idee idee) { entityManager.persist(idee); return; }
 * 
 * public void delete(Idee idee) { if (entityManager.contains(idee))
 * entityManager.remove(idee); else
 * entityManager.remove(entityManager.merge(idee)); return; }
 * 
 * @SuppressWarnings("unchecked") public List getAll() { return
 * entityManager.createQuery("from Idee").getResultList(); }
 * 
 * public Idee getByAuteur(String auteur) { return (Idee)
 * entityManager.createQuery( "from Idee where auteur = :auteur")
 * .setParameter("auteur", auteur) .getSingleResult(); }
 * 
 * public Idee getById(long id) { return entityManager.find(Idee.class, id); }
 * 
 * }
 */