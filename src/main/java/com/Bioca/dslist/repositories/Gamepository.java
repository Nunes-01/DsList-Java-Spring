package com.Bioca.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bioca.dslist.entities.Game;

public interface Gamepository extends JpaRepository< Game, Long> {
	
}
