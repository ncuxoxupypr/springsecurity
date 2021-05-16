package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Role getRoleByName(String role) {
        return entityManager.createQuery("select u from Role u  " + " where u.nameRoles =?1", Role.class)
                .setParameter(1, role)
                .getSingleResult();
    }

    @Override
    public List<Role> list_roles() {
        Query query = entityManager.createQuery("From Role");
        return query.getResultList();
    }
}
