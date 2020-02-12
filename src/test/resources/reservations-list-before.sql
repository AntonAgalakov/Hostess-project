delete from reservation;

insert into reservation(id, text, ntable, ndata, ntime, nofp, user_id) values
(1, 'firstReservation', '2', '22.01.20', '13:43', '444444444', 1),
(2, 'secondReservation', '1', '22.01.20', '15:43', '444534444', 1),
(3, 'thirdReservation', '4', '22.01.20', '13:00', '4488844', 1),
(4, 'fourthReservation', '2', '7.01.20', '5:43', '4432444', 1),
(5, 'fifthReservation', '3', '3.01.20', '0:00', '4444333344', 1);

alter sequence hibernate_sequence restart with 7;