package com.hanghae.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Seats {

    private final List<Seat> seats;

    //TODO Theater 에서 행, 열 입력히야 셍상하도록
    public static Seats create(int rowSize, int colSize){
        List<Seat> seats = new ArrayList<>();
        for(int row = 1; row <= rowSize; row++){
            for(int col = 1; col <= colSize; col++){
                seats.add(new Seat(row, col));
            }
        }
        return new Seats(seats);
    }

    public Seats(final List<Seat> seats) {
        this.seats = seats;
    }

    public int size(){
        return seats.size();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seats seats1 = (Seats) o;
        return Objects.equals(seats, seats1.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(seats);
    }
}
