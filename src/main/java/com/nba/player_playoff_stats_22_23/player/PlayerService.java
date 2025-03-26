package com.nba.player_playoff_stats_22_23.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    //spring will create instance of this class and manage as a container

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName){
        return playerRepository.findAll().stream()
                .filter(player->teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    //Will find players that containt the name, useful if like only first name entered, or last name entered
    public List<Player> getPlayerByName(String searchText){
        return playerRepository.findAll().stream()
                .filter(player->player.getName().toLowerCase().contains(searchText))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByPos(String pos){
        return playerRepository.findAll().stream()
                .filter(player->
                        player.getPos().toLowerCase().equals(pos.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByAge(Integer age){
        return playerRepository.findAll().stream()
                .filter(player->
                        player.getAge().equals(age))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByTeamAndPos(String team, String pos){
        return playerRepository.findAll().stream()
                .filter(player ->
                        team.equals(player.getTeam()) && pos.equals(player.getPos()))
                .collect(Collectors.toList());
    }

    public Player addPlayer(Player player){
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer){
        Optional<Player> player = playerRepository.findByName(updatedPlayer.getName());
        if(player.isPresent()){
            Player playerToUpdate = player.get();
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPos(updatedPlayer.getPos());
            playerToUpdate.setAge(updatedPlayer.getAge());
            playerToUpdate.setName(updatedPlayer.getName());
            playerToUpdate.setPoints(updatedPlayer.getPoints());
            //add all the details
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    @Transactional
    public void deletePlayer(String name){
        playerRepository.deleteByName(name);
    }

}
