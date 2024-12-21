package com.saumyat.microservice.hotelService.services;

import com.saumyat.microservice.hotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotelById(String id);
}
