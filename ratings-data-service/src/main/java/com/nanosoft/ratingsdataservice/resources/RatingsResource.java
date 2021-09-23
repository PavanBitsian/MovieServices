package com.nanosoft.ratingsdataservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanosoft.ratingsdataservice.model.Rating;
import com.nanosoft.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		ArrayList<Rating> al = new ArrayList<Rating>();
		al.add( new Rating("1234",4));
		al.add( new Rating("6789",3));
		UserRating userRating = new UserRating();
		userRating.setUserRating(al);
		return userRating;
	}
	
}
