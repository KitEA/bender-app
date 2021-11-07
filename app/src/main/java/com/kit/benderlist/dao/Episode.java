package com.kit.benderlist.dao;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Episode {
    @Id
    private Long id;

    private Integer season;
    private Integer episode;
    private Integer episodeInSeason;
    private String title;
    private String director;
    private String writer;
    private String airDate;
    private String openingLine;
}
