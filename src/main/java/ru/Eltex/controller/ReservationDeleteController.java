package ru.Eltex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.Eltex.domain.Reservation;
import ru.Eltex.repos.ReservationRepo;

@Controller
@RequestMapping("/delete_reservation")
public class ReservationDeleteController {

    @Autowired
    ReservationRepo reservationRepo;

    @GetMapping("{reservation}")
    public String reservationDelete(@PathVariable Reservation reservation, Model model) {
        model.addAttribute("reservation", reservation);

        return "mainDelete";
    }
    @PostMapping
    public String reservationDelete(
            @RequestParam String text,
            @RequestParam String ntable,
            @RequestParam String ndata,
            @RequestParam String ntime,
            @RequestParam String nofP,
            @RequestParam("reservationId") Reservation reservation
    ) {
        reservationRepo.delete(reservation);
        return "redirect:/main";
    }
}
