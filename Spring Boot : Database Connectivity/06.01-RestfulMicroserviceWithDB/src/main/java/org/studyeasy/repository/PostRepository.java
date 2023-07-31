package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.studyeasy.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
	

}
