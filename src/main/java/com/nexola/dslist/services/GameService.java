package com.nexola.dslist.services;

import com.nexola.dslist.dto.GameMinDTO;
import com.nexola.dslist.entities.Game;
import com.nexola.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Registra o Service como um componente do sistema
public class GameService {

    @Autowired // Injeta o componente repository ao componente service
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
