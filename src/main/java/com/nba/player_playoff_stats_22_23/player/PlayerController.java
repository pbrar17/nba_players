package com.nba.player_playoff_stats_22_23.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required =false) String team,
            @RequestParam(required =false) String name,
            @RequestParam(required =false) String pos,
            @RequestParam(required =false) String age
    ){
        if(team!=null && pos!=null) {
            return playerService.getPlayerByTeamAndPos(team, pos);
        }else if(team!=null){
            return playerService.getPlayersFromTeam(team);
        }else if(name!=null){
            return playerService.getPlayerByName(name);
        }else if(pos!=null){
            return playerService.getPlayerByPos(pos);
        }else if(age!=null){
            return playerService.getPlayerByAge(Integer.parseInt(age));
        }else{
            return playerService.getPlayers();
        }

    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        Player savedPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player updatedPlayer){
        Player updatedPlayerResponse = playerService.updatePlayer(updatedPlayer);

        if(updatedPlayerResponse!=null){
            return new ResponseEntity<>(updatedPlayerResponse, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName){
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Player deleted", HttpStatus.OK);
    }

}
