package pl.idzikdev.webfootballmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.idzikdev.webfootballmanager.model.Player;
import pl.idzikdev.webfootballmanager.repository.PlayerRepository;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PlayerController {
    public PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    @GetMapping("players")
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }
}
