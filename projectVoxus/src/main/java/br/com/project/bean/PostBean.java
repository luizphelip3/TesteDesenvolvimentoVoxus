package br.com.project.bean;

import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.project.dao.PostDAO;
import br.com.project.model.Post;

@Named
@RequestScoped
public class PostBean {
	
	private Post post = new Post();

	public void save() {
		LocalDate data= LocalDate.now();
		this.post.setDataPost(data);
		new PostDAO().save(this.post);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You're post has been blogged!"));
	}
	
	public List<Post> getPosts(){
		return new PostDAO().getAll();
		
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
