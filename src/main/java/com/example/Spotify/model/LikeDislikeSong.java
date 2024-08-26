package com.example.Spotify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.DependsOn;

//@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class LikedSong{
//    @Id
//    @GeneratedValue
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "_user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "_song_id")
//    private SongInfo songInfo;
//
//
//}


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LikeDislikeSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean flag; //t liked, f disliked


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "song_id")
    private SongInfo songInfo;


}
