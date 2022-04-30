package com.wilkom.awsspringbootdevtest.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @apiNote Class to handle Players objects
 * @author Wilson
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Long number;
    private String name;
    private String lastname;
    private PositionEnum position;
    private Boolean isCaptain;
    @JsonIgnore
    private Team team;
}
