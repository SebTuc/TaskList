package com.seb.dao;

import java.util.List;

import com.seb.model.Types;

public interface TypesDAO {
	
	public List<Types>getAllTypes();
	public void addTypes(Types types);
	public Types getTypesById(int typesId);
	
	
}
