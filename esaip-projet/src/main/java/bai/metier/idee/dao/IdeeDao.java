/*
 * package bai.metier.idee.dao;
 * 
 * import java.util.List;
 * 
 * import org.hibernate.HibernateException; import org.hibernate.Session; import
 * org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Repository; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import bai.data.entite.Idee;
 * 
 * @Repository public class IdeeDao {
 * 
 * @Autowired private SessionFactory sessionFactory;
 * 
 * @Transactional public void save(Idee idee) { Session session =
 * sessionFactory.getCurrentSession(); session.save(idee); }
 * 
 * @Transactional public List<Idee> list() { Session session =
 * sessionFactory.getCurrentSession(); List<Idee> documents = null; try {
 * documents = session.createQuery("from Idee").list();
 * 
 * } catch (HibernateException e) { e.printStackTrace(); } return documents; }
 * 
 * @Transactional public Idee get(Integer id) { Session session =
 * sessionFactory.getCurrentSession(); return session.get(Idee.class, id); }
 * 
 * @Transactional public void remove(Integer id) { Session session =
 * sessionFactory.getCurrentSession();
 * 
 * Idee idee = session.get(Idee.class, id);
 * 
 * session.delete(idee); } }
 */