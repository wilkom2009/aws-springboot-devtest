package com.wilkom.awsspringbootdevtest.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.wilkom.awsspringbootdevtest.controller.model.Player;
import com.wilkom.awsspringbootdevtest.controller.model.PositionEnum;
import com.wilkom.awsspringbootdevtest.controller.model.Team;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public ResponseEntity<?> SayGoodMorning() {
        Team teamA = new Team(1, "Nibombé DARE", 1999, null);
        Set<Player> players = new HashSet<>();
        players.add(new Player(1L, "ADEBAYOR", "Emmanuel", PositionEnum.forward, Boolean.TRUE, teamA));
        players.add(new Player(2L, "AGASSA", "Kossi", PositionEnum.goaltender, Boolean.FALSE, teamA));
        players.add(new Player(3L, "AKAKPO", "Serge", PositionEnum.defenseman, Boolean.FALSE, teamA));
        teamA.setPlayers(players);
        return new ResponseEntity<>(teamA, HttpStatus.OK);
    }
}
