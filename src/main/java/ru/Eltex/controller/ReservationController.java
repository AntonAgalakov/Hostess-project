package ru.Eltex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.Eltex.domain.Reservation;
import ru.Eltex.domain.User;
import ru.Eltex.repos.ReservationRepo;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    ReservationRepo reservationRepo;

    @GetMapping("{reservation}")
    public String reservationEdit(@PathVariable Reservation reservation, Model model) {
        model.addAttribute("reservation", reservation);

        return "mainEdit";
    }

    @PostMapping
    public String reservationSave(
            @RequestParam String text,
            @RequestParam String ntable,
            @RequestParam String ndata,
            @RequestParam String ntime,
            @RequestParam String nofP,
            @RequestParam("reservationId") Reservation reservation
    ) {
        reservation.setText(text);
        reservation.setTable(ntable);
        reservation.setData(ndata);
        reservation.setTime(ntime);
        reservation.setNofP(nofP);

        reservationRepo.save(reservation);

        return "redirect:/main";
    }

}
