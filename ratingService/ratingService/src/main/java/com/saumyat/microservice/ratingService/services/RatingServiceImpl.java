package com.saumyat.microservice.ratingService.services;

import com.saumyat.microservice.ratingService.entities.Rating;
import com.saumyat.microservice.ratingService.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        String id= UUID.randomUUID().toString();
        rating.setRatingId(id);

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllOfUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllOfHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
