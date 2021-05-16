package br.com.project.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.project.dao.DAO;
import br.com.project.model.Post;

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
public class PostEndpoint {
		
	DAO<Post> dao = new DAO<Post>(Post.class);
	
	@GET
	@Path("{id}")
	public Response showAll(@PathParam("id") Long id) {
		Post post = dao.findById(id);
		if (post == null) {
			return Response.status(Response.Status.NOT_FOUND).entity(post).build();
		}
		return Response.status(Response.Status.OK).entity(post).build(); 
	}
		
	
	@GET
	public List<Post> showById() {
		return dao.getAll();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createPost(Post post) {
		if (post == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		
		try {
			dao.save(post);
			return Response.status(Response.Status.CREATED).entity(post).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
		
	}
		@PUT
		@Path("{id}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response updatePost(@PathParam("id") Long id, Post post) {
			post.setId(id);
			dao.update(post);
			return Response.status(Response.Status.OK).entity(post).build();
		}
		
		@DELETE
		@Path("{id}")
		@Consumes(MediaType.APPLICATION_JSON)
		public String deletePost(@PathParam("id") Long id) {
		dao.deleteById(id);
		return "Deletado Com Sucesso";
		}	
}
	
	
	

	

