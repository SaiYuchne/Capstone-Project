package capstone.is4103capstone.seat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seatAllocation/forecast")
@CrossOrigin(origins = "http://localhost:3000")
public class SeatDemandForecastController {

    // ---------------------------------- GET: Retrieve ----------------------------------

    @GetMapping
    public ResponseEntity getSeatDemandForecast() {

        return ResponseEntity.ok("OK");
    }
}
