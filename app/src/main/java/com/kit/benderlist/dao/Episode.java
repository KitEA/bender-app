package com.kit.benderlist.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Episode(Integer season, Integer episode, Integer episodeInSeason, String title, String director, String writer, String airDate, String openingLine) {
        this.season = season;
        this.episode = episode;
        this.episodeInSeason = episodeInSeason;
        this.title = title;
        this.director = director;
        this.writer = writer;
        this.airDate = airDate;
        this.openingLine = openingLine;
    }

    private Integer season;
    private Integer episode;
    private Integer episodeInSeason;
    private String title;
    private String director;
    private String writer;
    private String airDate;
    private String openingLine;
}
