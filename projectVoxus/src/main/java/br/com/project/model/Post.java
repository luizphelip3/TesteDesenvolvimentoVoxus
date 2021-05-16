package br.com.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="TITLE", length=100)
	private String title;
	@Column(name="CONTENT")
	private String content;
	@Column(name="TAG", length=10)
	private String tag;	
	@Column(name="DATA_POST")
	private LocalDate dataPost;
	
	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public LocalDate getDataPost() {
		return dataPost;
	}
	public void setDataPost(LocalDate dataPost) {
		this.dataPost = dataPost;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", tag=" + tag + ", dataPost="
				+ getDataPost() + "]";
	}

	public void setId(Long id) {
		this.id = id;
		
	}
	
	
}