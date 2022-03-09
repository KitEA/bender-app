package com.kit.benderlist.dto.mapper;

import com.kit.benderlist.dao.Episode;
import com.kit.benderlist.dto.EpisodeDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EpisodeMapper {
    EpisodeDto episodeToEpisodeDto(Episode episode);
    List<EpisodeDto> episodesToEpisodesDto(List<Episode> episodes);
}
