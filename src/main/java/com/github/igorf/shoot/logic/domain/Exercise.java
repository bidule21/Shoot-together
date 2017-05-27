package com.github.igorf.shoot.logic.domain;

import lombok.Data;

@Data
public class Exercise {
    private long id;
    private String title;
    private String description;
    private int shots;
}