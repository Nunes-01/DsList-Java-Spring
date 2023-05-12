package com.Bioca.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bioca.dslist.dto.GameDTO;
import com.Bioca.dslist.dto.GameMinDTO;
import com.Bioca.dslist.entities.Game;
import com.Bioca.dslist.repositories.Gamepository;

@Service
public class GameService {

	@Autowired
	private Gamepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();

	}
}
