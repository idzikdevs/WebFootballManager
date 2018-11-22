package pl.idzikdev.webfootballmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.webfootballmanager.model.Player;
import pl.idzikdev.webfootballmanager.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("players/{hash}")
    public ResponseEntity<Player> getPlayerByHash(@PathVariable(name = "hash") String hash){
        Optional<Player> playerOptional=playerRepository.findByHash(hash);
        if (playerOptional.isPresent()){
            return new ResponseEntity<>(playerOptional.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
