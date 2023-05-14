package com.Bioca.dslist.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bioca.dslist.dto.GameListDTO;
import com.Bioca.dslist.entities.GameList;
import com.Bioca.dslist.projections.GameMinProjection;
import com.Bioca.dslist.repositories.GameListpository;
import com.Bioca.dslist.repositories.Gamepository;

@Service
public class GameListService {

	@Autowired
	private GameListpository gameListRepository;

	@Autowired
	private Gamepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}

	@Transactional
	public void move(Long listId, int SourceIndex, int destinationIndex) {

		List<GameMinProjection> list = gameRepository.searchByList(listId);

		GameMinProjection obj = list.remove(SourceIndex);
		list.add(destinationIndex, obj);

		int min = SourceIndex < destinationIndex ? SourceIndex : destinationIndex;
		int max = SourceIndex < destinationIndex ? destinationIndex : SourceIndex;

		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);

		}
	}

}
