package com.examplecloud.desafio.cloudingparking.controller;

import com.examplecloud.desafio.cloudingparking.DTO.ParkingDTO;
import com.examplecloud.desafio.cloudingparking.Service.ParkingService;
import com.examplecloud.desafio.cloudingparking.mapper.ParkingMapper;
import com.examplecloud.desafio.cloudingparking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper){
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }


    @GetMapping
    public List <ParkingDTO> findAll(){
        List<Parking> parkingList =  parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return result;
    }






    //Controller sujo
   /* @GetMapping
    public List <Parking> findAll(){
    var parking = new Parking();
    parking.setColor("preto");
    parking.setLicense("MSS-1111");
    parking.setModel("Gol");
    parking.setState("CE");
    return Arrays.asList(parking,parking);
    }*/
}
