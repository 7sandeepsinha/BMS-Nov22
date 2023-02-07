package com.scaler.BMS.controller;

import com.scaler.BMS.dto.TheatreCreationRequestDTO;
import com.scaler.BMS.dto.TheatreCreationResponseDTO;
import com.scaler.BMS.model.Theatre;
import com.scaler.BMS.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {
    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @PostMapping("/theatre")
    public TheatreCreationResponseDTO createTheatre(@RequestBody TheatreCreationRequestDTO theatreCreationRequestDTO){
        Theatre savedTheatre = theatreService.createTheatre(theatreCreationRequestDTO.getTheatreName(), theatreCreationRequestDTO.getTheatreAddress(), theatreCreationRequestDTO.getCityId());

        //create a dto to return
        TheatreCreationResponseDTO theatreCreationResponseDTO = new TheatreCreationResponseDTO();
        theatreCreationResponseDTO.setTheatreId(savedTheatre.getId());
        theatreCreationResponseDTO.setTheatreName(savedTheatre.getName());
        theatreCreationResponseDTO.setThreatreAddress(savedTheatre.getAddress());
        theatreCreationResponseDTO.setCityName(savedTheatre.getCity().getName());

        return theatreCreationResponseDTO;
    }

}
