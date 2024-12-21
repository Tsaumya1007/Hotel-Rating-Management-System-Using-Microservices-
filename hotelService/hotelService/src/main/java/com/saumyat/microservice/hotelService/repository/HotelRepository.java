package com.saumyat.microservice.hotelService.repository;

import com.saumyat.microservice.hotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
