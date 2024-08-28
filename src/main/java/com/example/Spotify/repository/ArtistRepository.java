package com.example.Spotify.repository;

import com.example.Spotify.model.Artist;
import com.example.Spotify.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findById(long id);
    List<SongInfo> findByName(String name);

}
