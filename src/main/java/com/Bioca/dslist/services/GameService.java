package com.Bioca.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bioca.dslist.dto.GameMinDTO;
import com.Bioca.dslist.entities.Game;
import com.Bioca.dslist.repositories.Gamepository;

@Service
public class GameService {

	@Autowired
	private Gamepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();

	}
}
