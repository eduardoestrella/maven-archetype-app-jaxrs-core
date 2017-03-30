#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.Set;

public abstract class JpaDao<K, E> implements Dao<K, E> {

    protected Class<E> entityClass;

    @PersistenceContext(unitName = "WhiteHatGamingPersistenceUnit")
    protected EntityManager entityManager;

    @Resource
    protected UserTransaction userTransaction;

    public JpaDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }

    public void persist(E entity) throws Exception {
        if (validation(entity)) {
            userTransaction.begin();
            entityManager.persist(entity);
            userTransaction.commit();
        }
    }

    public void delete(E entity) throws Exception {
        entityManager.remove(entity);
    }

    public E findById(K id) {
        return entityManager.find(entityClass, id);
    }

    private boolean validation(E entity) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<E>> constraintViolations = validator.validate(entity);
        if (constraintViolations.size() > 0) {
            Iterator<ConstraintViolation<E>> iterator = constraintViolations.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<E> cv = iterator.next();
                System.err.println(cv.getRootBeanClass().getName() + "." + cv.getPropertyPath() + " " + cv.getMessage());
            }

            return false;
        }

        return true;
    }

}
