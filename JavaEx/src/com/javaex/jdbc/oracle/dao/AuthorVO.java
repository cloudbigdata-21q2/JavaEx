package com.javaex.jdbc.oracle.dao;

//	DTO 객체: 자바의 계층간 데이터 전송을 담당하는 객체
//	필드, getter/setter, toString, equals 정도의 메서드만 작성
//	반드시 기본 생성자가 있어야 함
//	일반적으로 로직 메서드는 작성하지 않는다
public class AuthorVO {
	private Long id;	//	PK
	private String authorName;
	private String authorDesc;
	
	//	생성자
	public AuthorVO() {
		
	}
	
	//	필수 필드 생성자
	public AuthorVO(Long id, String authorName) {
		this.id = id;
		this.authorName = authorName;
	}
	
	//	전체 필드 생성자
	public AuthorVO(Long id, 
			String authorName,
			String authorDesc) {
		this(id, authorName);
		/*
		if (authorDesc == null) {
			this.authorDesc = "";
		} else {
			this.authorDesc = authorDesc;
		}
		*/
		this.authorDesc = authorDesc == null ? "": authorDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		/*
		if (authorDesc != null) {
			this.authorDesc = authorDesc;
		} else {
			this.authorDesc = "";
		}
		*/
		this.authorDesc = authorDesc == null ? "": authorDesc;
	}

	@Override
	public String toString() {
		return "AuthorVO [id=" + id + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
}
