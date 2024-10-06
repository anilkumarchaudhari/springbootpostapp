package com.app.post.springbootpostapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PostServiceImpl implements PostService {

	// autowire dao layer
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Post> getPostsList() {
		// TODO Auto-generated method stub
		
		ResponseEntity<Post[]> postlist =restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post[].class);
			Post[] postArrays= postlist.getBody();
			
			return Arrays.asList(postArrays);
				//return Arrays.asList(new Post(1,21,"my post", "help in reading post"));
	}

	
}
