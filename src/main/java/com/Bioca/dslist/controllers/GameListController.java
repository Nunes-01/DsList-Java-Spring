package com.Bioca.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bioca.dslist.dto.GameListDTO;
import com.Bioca.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListservice;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListservice.findAll();
		return result;

	}
}
