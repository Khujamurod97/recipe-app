package uz.khujamurod.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.khujamurod.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}   
