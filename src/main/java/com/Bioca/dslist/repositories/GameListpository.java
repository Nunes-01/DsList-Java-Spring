package com.Bioca.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bioca.dslist.entities.GameList;

public interface GameListpository extends JpaRepository< GameList, Long> {
	
}
