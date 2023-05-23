package com.nexola.dslist.services;

import com.nexola.dslist.dto.GameDTO;
import com.nexola.dslist.dto.GameMinDTO;
import com.nexola.dslist.entities.Game;
import com.nexola.dslist.projections.GameMinProjection;
import com.nexola.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // Registra o Service como um componente do sistema
public class GameService {

    @Autowired // Injeta o componente repository ao componente service
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // Assegura que nenhuma solicitação de escrita será feita
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
