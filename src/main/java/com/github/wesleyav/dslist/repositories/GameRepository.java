package com.github.wesleyav.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.wesleyav.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
