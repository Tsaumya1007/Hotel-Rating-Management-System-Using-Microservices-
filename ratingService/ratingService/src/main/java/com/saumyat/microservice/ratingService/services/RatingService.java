package com.saumyat.microservice.ratingService.services;

import com.saumyat.microservice.ratingService.entities.Rating;

import java.util.List;

public interface RatingService {

    public Rating create(Rating rating);

    public List<Rating> getAll();

    public List<Rating> getAllOfUserId(String userId);

    public List<Rating> getAllOfHotelId(String hotelId);

}
