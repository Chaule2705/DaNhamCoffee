package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.CategoryDAO;
import poly.store.entity.Category;
import poly.store.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO dao;

	public List<Category> findAll() {
		return dao.findAll();
	}

	public Category findById(String id) {
		return dao.findById(id).get();
	}

	public Category create(Category category) {
		return dao.save(category);
	}

	public Category update(Category category) {
		return dao.save(category);
	}

	public void delete(String id) {
		dao.deleteById(id);
	}
}
