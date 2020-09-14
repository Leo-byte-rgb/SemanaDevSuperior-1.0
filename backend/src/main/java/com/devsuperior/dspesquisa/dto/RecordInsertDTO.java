package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO  implements Serializable{

	
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	private Long GameId;
	
	public RecordInsertDTO() {
		
	}

	public RecordInsertDTO(String name, Integer age, Long gameId) {
		super();
		this.name = name;
		this.age = age;
		GameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return GameId;
	}

	public void setGameId(Long gameId) {
		GameId = gameId;
	}
	
	
}
