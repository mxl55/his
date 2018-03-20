package org.his.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CommonDao<T,PK extends Serializable> {
	public void addInfo(T entity);
	
	public void updateInfo(T entity);
	
	public T getInfoById(PK id);

	public void deleteInfoById(PK id);
	
	public void batchDelete(PK[] ids);
	
	public List<T> getAll();
	
	public List<T> getPage(@Param("start")Integer start,@Param("pageSize")Integer pageSize,@Param("condition")T condition,@Param("column") String column,@Param("orderBy") String orderBy);
	
	public Integer getCount(@Param("condition")T condition);

}
