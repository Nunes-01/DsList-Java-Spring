package com.Bioca.dslist.dto;

import com.Bioca.dslist.entities.Game;
import com.Bioca.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection Projection) {

		id = Projection.getId();
		title = Projection.getTitle();
		year = Projection.getYear();
		imgUrl = Projection.getImgUrl();
		shortDescription = Projection.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
