package com.Bioca.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bioca.dslist.dto.GameDTO;
import com.Bioca.dslist.dto.GameMinDTO;
import com.Bioca.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameservice;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable long id) {
		GameDTO result = gameservice.findById(id);
		return result;

	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameservice.findAll();
		return result;

	}
}
