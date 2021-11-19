package com.kit.benderlist.controller;

import com.kit.benderlist.dto.EpisodeDto;
import com.kit.benderlist.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/episodes")
public class EpisodeController {
    private final EpisodeService episodeService;

    @GetMapping
    public List<EpisodeDto> allEpisodes() {
        return episodeService.getAllEpisodes();
    }
}
