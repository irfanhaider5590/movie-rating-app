package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.Rating;
import io.javabrains.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

//    @RequestMapping("/user/{userId}")
//    public UserRating getUserRatings(@PathVariable("userId") String userId) {
//        UserRating userRating = new UserRating();
//        userRating.initData(userId);
//        return userRating;
//
//    }
    @RequestMapping("/user/{userId}")
    public UserRating getRating(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }

}
