package com.app.post.springbootpostapp;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
	
	public List<Post> getPostsList();

}
