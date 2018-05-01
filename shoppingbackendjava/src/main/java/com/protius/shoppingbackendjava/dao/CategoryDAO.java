package com.protius.shoppingbackendjava.dao;

import java.util.List;

import com.protius.shoppingbackendjava.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
