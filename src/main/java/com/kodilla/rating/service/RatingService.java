package com.kodilla.rating.service;

import com.kodilla.rating.domain.Rating;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingService {

    public List<Rating> findAllRatings() {
        System.out.println("I have found all ratings!");
        return new ArrayList<>();
    }

    public List<Rating> findRatingsByMovieId(Long movieId) {
        System.out.println("Just one rating");
        return new ArrayList();
    }

    public Rating createRating(Rating rating) {
        System.out.println("rating created!");
        return rating;
    }

    public void deleteRating(Long ratingId) {
        System.out.println("rating has been deleted!");
    }

    public Rating updateRating(Rating rating, Long ratingId) {
        return rating;
    }
}
