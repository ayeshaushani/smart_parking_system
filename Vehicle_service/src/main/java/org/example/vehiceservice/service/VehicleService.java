package org.example.vehiceservice.service;

import org.example.vehiceservice.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    int saveVehicle(VehicleDTO vehicle);

    int updateVehicle(VehicleDTO vehicleDTO);

    int deleteVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicle();

    VehicleDTO getVehicleByNumberPlate(String licenPlate);
}
