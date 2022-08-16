package com.examplecloud.desafio.cloudingparking.Service;

import com.examplecloud.desafio.cloudingparking.model.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static final Map<String, Parking> parkingMap = new HashMap<>();

    static {
        var id  = getUUID();
        Parking parking = new Parking("", "DMS - 1111", "SC", "CELTA", "PRETO");
        parkingMap.put(id, parking);


    }

    public List<Parking> findAll() {
        return parkingMap.values().stream().collect(Collectors.toList());
    }

    public static String getUUID(){
  return UUID.randomUUID().toString().replace("-","");



    }

}
