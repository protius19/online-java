package com.protius.shoppingbackendjava.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.protius.shoppingbackendjava.dao.CategoryDAO;
import com.protius.shoppingbackendjava.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories	= new ArrayList<>();
	
	static {
		
		Category 
		//add 1st category
		category = new Category();
				
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//add 2nd category
		category = new Category();
		
		category.setId(2);
		category.setName("Handphone");
		category.setDescription("This is HP");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//add 3nd category
		category = new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is LAPI");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enchanced for each
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
