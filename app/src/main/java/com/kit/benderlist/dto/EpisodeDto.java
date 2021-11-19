package com.kit.benderlist.dto;


public record EpisodeDto (Long id, Integer season,
                          Integer episode, Integer episodeInSeason,
                          String title, String director, String writer,
                          String airDate, String openingLine) { }
