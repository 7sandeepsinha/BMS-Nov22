package com.scaler.BMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String name;
    @Column(name = "seat_row")
    private int row;

    @Column(name = "seat_column")
    private int column;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
