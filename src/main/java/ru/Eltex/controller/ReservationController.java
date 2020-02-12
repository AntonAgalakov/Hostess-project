package ru.Eltex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.Eltex.domain.Reservation;
import ru.Eltex.repos.ReservationRepo;

import java.util.List;

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
            @RequestParam("reservationId") Reservation reservation) {
        List<Reservation> reservations = (List<Reservation>) reservationRepo.findAll();
        reservations = reservationRepo.findByNdataAndNtableAndNtime(ndata, ntable, ntime);

        if (reservations.isEmpty()) {
            reservation.setText(text);
            reservation.setTable(ntable);
            reservation.setData(ndata);
            reservation.setTime(ntime);
            reservation.setNofP(nofP);

            reservationRepo.save(reservation);

            return "redirect:/main";
        } else {
            return "redirect:/error";
        }

    }
}
