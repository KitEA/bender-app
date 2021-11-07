package com.kit.benderlist.rest;

import com.kit.benderlist.dao.Episode;
import com.kit.benderlist.dao.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EpisodeController {
    private final EpisodeRepository episodeRepository;

    @GetMapping("/episodes")
    public List<Episode> allEpisodes() {
        return episodeRepository.findAll();
    }
}
