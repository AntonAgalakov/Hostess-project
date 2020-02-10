package ru.Eltex.controller;


import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.Eltex.domain.Reservation;
import ru.Eltex.domain.Role;
import ru.Eltex.domain.StringToData;
import ru.Eltex.domain.User;
import ru.Eltex.repos.ReservationRepo;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping
public class MainController {
    @Autowired
    private ReservationRepo reservationRepo;
    @Value("dsata")
    public String dataT = (new StringToData()).get();

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }


    @GetMapping("/main")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, @RequestParam(required = false, defaultValue ="") String filterD, Model model) {
        Iterable<Reservation> reservations = reservationRepo.findAll();
        if (filterD != null && !filterD.isEmpty() && filter != null && !filter.isEmpty()) {
            reservations = reservationRepo.findByDataAndNtable(filterD, filter);
        } else if (filter != null && !filter.isEmpty()) {
            reservations = reservationRepo.findByNtable(filter);
        } else if (filterD != null && !filterD.isEmpty()) {
            reservations = reservationRepo.findByData(filterD);
        } else {
            reservations = reservationRepo.findAll();
        }
        model.addAttribute("reservations", reservations);
        model.addAttribute("filter", filter);
        model.addAttribute("filterD", filterD);

        return "main";
    }

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String text,
            @RequestParam String ntable,
            @RequestParam String data,
            @RequestParam String time,
            @RequestParam String nofP, Map<String, Object> model
    ) throws IOException {
        Reservation reservation = new Reservation(text, ntable, data, time, nofP, user);

        reservationRepo.save(reservation);

        Iterable<Reservation> reservations = reservationRepo.findAll();

        model.put("reservations", reservations);

        return "main";
    }


}