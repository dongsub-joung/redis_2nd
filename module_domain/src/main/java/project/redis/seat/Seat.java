package project.redis.seat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Seat {
    private Boolean isReserved;

    @Getter
    private String seatRow;
    @Getter
    private Integer seatColumn;

    public static Seat of(Boolean isReserved, String seatRow, Integer seatColumn) {
        return new Seat(isReserved, seatRow, seatColumn);
    }

    public int compareRow(Seat otherSeat) {
        return this.seatRow.compareTo(otherSeat.seatRow);
    }

    public int compareCol(Seat otherSeat) {
        return Integer.compare(this.seatColumn, otherSeat.seatColumn);
    }

}
