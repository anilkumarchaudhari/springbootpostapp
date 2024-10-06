package com.app.post.springbootpostapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

	//PostService postService= new PostService();
	@Autowired 
	PostService postService;
	
	
	@RequestMapping(value = "/get/posts/list", method = RequestMethod.GET )
	//@GetMapping("/user")
	public List<Post> getPostsList() {
		return postService.getPostsList();
	}
	
	
}
