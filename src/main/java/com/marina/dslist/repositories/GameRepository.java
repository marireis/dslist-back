package com.marina.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marina.dslist.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
