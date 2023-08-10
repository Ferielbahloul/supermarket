package tn.csf.supermarket.repository;



import org.springframework.data.repository.CrudRepository;

import tn.csf.supermarket.model.Article;






//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  
