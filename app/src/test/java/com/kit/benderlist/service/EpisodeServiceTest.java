package com.kit.benderlist.service;

import com.kit.benderlist.dao.Episode;
import com.kit.benderlist.dao.EpisodeRepository;
import com.kit.benderlist.dto.EpisodeDto;
import com.kit.benderlist.dto.mapper.EpisodeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
class EpisodeServiceTest {
    @Autowired
    private EpisodeService episodeService;
    @Autowired
    private EpisodeRepository episodeRepository;
    @Autowired
    private EpisodeMapper episodeMapper;

    @Test
    void shouldReturnEpisode() {
        // given
        // Add into db one episode
        Episode episodeOne = episodeRepository.save(new Episode(1, 1, 1, "Space Pilot 3000",
                "Rich Moore & Gregg Vanzo", "David X. Cohen & Matt Groening", "(1999-03-28)", "In Color."));
        EpisodeDto episodeOneDto = episodeMapper.episodeToEpisodeDto(episodeOne);

        // when
        List<EpisodeDto> result = episodeService.getAllEpisodes();

        // then
        // check fields
        assertThat(result).allSatisfy(episodeDto -> {
          assertThat(episodeDto.title()).isEqualTo(episodeOneDto.title());
        });
    }
}