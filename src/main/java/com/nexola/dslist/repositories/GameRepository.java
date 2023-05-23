package com.nexola.dslist.repositories;

import com.nexola.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { // Repositório JPA para acessar dados e interagir com eles
}
