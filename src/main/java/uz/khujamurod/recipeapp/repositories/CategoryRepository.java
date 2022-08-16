package uz.khujamurod.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.khujamurod.recipeapp.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
