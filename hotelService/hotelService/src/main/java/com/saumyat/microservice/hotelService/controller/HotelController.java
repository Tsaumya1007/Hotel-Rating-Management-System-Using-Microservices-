package com.saumyat.microservice.hotelService.controller;

import com.saumyat.microservice.hotelService.entities.Hotel;
import com.saumyat.microservice.hotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public Hotel create(@RequestBody Hotel hotel){
        return hotelService.create(hotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> array= hotelService.getAll();
        return new ResponseEntity<>(array, HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel res= hotelService.getHotelById(hotelId);

        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
