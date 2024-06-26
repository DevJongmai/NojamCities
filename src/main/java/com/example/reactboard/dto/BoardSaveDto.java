package com.example.reactboard.dto;

import com.example.reactboard.db.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardSaveDto {
    private Long idx;
    private String title;
    private String contents;
    private String createdBy;
    private String city;
    private Integer likes;
    private String image;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .idx(idx)
                .title(title)
                .contents(contents)
                .createdBy(createdBy)
                .city(city)
                .likes(likes)
                .image(image)
                .build();
    }
}
