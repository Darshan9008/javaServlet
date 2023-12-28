package com.xworkz.singerspring.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class SingerDTO {

	
	@NotNull
	@Size(min=3, max=20, message = "please enter valid song name")
	private String name;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid singer name")
	private String singer;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid composer name")
	private String composer;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid duration")
	private String duration;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid album name")
	private String album;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid language")
	private String language;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid date")        //singer and language
	private String releaseDate;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid producer name")
	private String producer;
	
	@NotNull
	@Size(min=3 ,max=20 ,message="please enter valid director name")
	private String director;
	
	
	
	
	
}
