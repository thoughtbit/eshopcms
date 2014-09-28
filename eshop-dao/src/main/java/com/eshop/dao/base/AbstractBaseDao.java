package com.eshop.dao.base;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import com.eshop.dao.Idao;
import com.eshop.commons.GetEntityClassUtil;
import com.eshop.commons.Pager;

public abstract class AbstractBaseDao<T,PK extends Serializable> implements BaseDao<T,PK>{
	Class entityClass = GetEntityClassUtil.getEntityClass(getClass());
	@Resource
	private Idao<T, Serializable> idao;
	
	public void save(T entity) {
		idao.save(entity);
	}

	public void delete(PK pk) {
		idao.delete(entityClass,pk);
	}

	public void update(T entity) {
		idao.update(entity);
	}

	public T findById(PK pk) {
		return idao.findById(entityClass, pk);
	}
	
	public List<T> findAll() {
		return idao.findAll(entityClass);
	}
	
	public Pager<T> findByPage(int showPages, int pageSize) {
		return idao.findByPage(entityClass, showPages, pageSize);
	}

}
