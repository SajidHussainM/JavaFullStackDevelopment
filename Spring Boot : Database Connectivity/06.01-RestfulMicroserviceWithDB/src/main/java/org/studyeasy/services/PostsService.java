package org.studyeasy.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;
import org.studyeasy.repository.PostRepository;

@Service
public class PostsService {
	@Autowired
	private PostRepository repo;
   
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		for(Post post: repo.findAll()) {
		    list.add(post);	
		}
		return list;
	}
	
	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post listElement) {
		repo.save(listElement);
		
	}
	public void updatePost(Post post) {
	
		repo.save(post);
	}

	public void deletePost(int id) {
	    repo.deleteById(id);
	}
}







