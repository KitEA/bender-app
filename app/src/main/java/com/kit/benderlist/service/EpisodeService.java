package com.kit.benderlist.service;

import com.kit.benderlist.dao.Episode;
import com.kit.benderlist.dao.EpisodeRepository;
import com.kit.benderlist.dto.EpisodeDto;
import com.kit.benderlist.dto.mapper.EpisodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EpisodeService {
    private final EpisodeRepository episodeRepository;
    private final EpisodeMapper episodeMapper;

    public List<EpisodeDto> getAllEpisodes() {
        List<Episode> episodeList = episodeRepository.findAll();
        return episodeMapper.episodesToEpisodesDto(episodeList);
    }
}
