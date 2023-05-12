package com.Bioca.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bioca.dslist.dto.GameListDTO;
import com.Bioca.dslist.entities.GameList;
import com.Bioca.dslist.repositories.GameListpository;

@Service
public class GameListService {

	@Autowired
	private GameListpository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}
}
