package com.kodilla.rating.domain;

import lombok.Data;

@Data
public class Rating {
    private Long id;
    private Long movieId;
    private Integer stars;

}


