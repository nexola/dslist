package com.nexola.dslist.controllers;

import com.nexola.dslist.dto.GameListDTO;
import com.nexola.dslist.dto.GameMinDTO;
import com.nexola.dslist.dto.ReplacementDTO;
import com.nexola.dslist.services.GameListService;
import com.nexola.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) { // RequestBody recebe o corpo da requisição
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
