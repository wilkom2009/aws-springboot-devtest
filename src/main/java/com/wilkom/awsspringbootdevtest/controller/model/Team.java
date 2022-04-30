package com.wilkom.awsspringbootdevtest.controller.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @apiNote Class to handle Team objects
 * @author Wilson
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    private long id;
    private String coach;
    private long year;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Player> players;
}
