package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    private Cinema cinema;

    @BeforeEach
    void setUp() {
        cinema = new Cinema(5, 10, 20);
    }

    @Test
    void bookingAnAvailableSeatShouldSucceed() {
        int hallNumber = 1;
        int row = 4;
        int seatNumber = 5;

        // Проверяем, что место доступно
        assertTrue(cinema.isSeatAvailable(hallNumber, row, seatNumber));

        // Бронируем место
        cinema.bookSeats(hallNumber, row, new int[]{seatNumber});

        // Проверяем, что место больше не доступно
        assertFalse(cinema.isSeatAvailable(hallNumber, row, seatNumber));
    }

    @Test
    void shouldNotAllowBookingOfAlreadyBookedSeat() {
        int hallNumber = 1;
        int row = 4;
        int seatNumber = 5;

        // Бронируем место
        cinema.bookSeats(hallNumber, row, new int[]{seatNumber});

        // Проверяем, что место забронировано
        assertFalse(cinema.isSeatAvailable(hallNumber, row, seatNumber));

        // Пытаемся забронировать то же место снова
        cinema.bookSeats(hallNumber, row, new int[]{seatNumber});

        // Проверяем, что повторное бронирование не изменило статус места
        assertFalse(cinema.isSeatAvailable(hallNumber, row, seatNumber));
    }

    @Test
    void shouldAllowBookingOfCancelledSeat() {
        int hallNumber = 1;
        int row = 4;
        int seatNumber = 5;

        // Бронируем место
        cinema.bookSeats(hallNumber, row, new int[]{seatNumber});

        // Отменяем бронирование
        cinema.cancelBooking(hallNumber, row, new int[]{seatNumber});

        // Проверяем, что место снова доступно
        assertTrue(cinema.isSeatAvailable(hallNumber, row, seatNumber));

        // Бронируем место снова
        cinema.bookSeats(hallNumber, row, new int[]{seatNumber});

        // Проверяем, что место забронировано
        assertFalse(cinema.isSeatAvailable(hallNumber, row, seatNumber));
    }

    @Test
    void allSeatsBookedShouldNotFindFourConsecutiveAvailableSeats() {
        int hallNumber = 1;
        // Забронировать все места в зале
        for (int r = 1; r <= 10; r++) {
            for (int s = 1; s <= 20; s++) {
                cinema.bookSeats(hallNumber, r, new int[]{s});
            }
        }

        // Проверка, что нет доступных четырех подряд идущих мест
        assertFalse(cinema.checkAvailability(hallNumber, 4));
    }
}








