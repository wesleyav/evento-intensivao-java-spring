package com.github.wesleyav.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.wesleyav.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
