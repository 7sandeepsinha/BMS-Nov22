package com.scaler.BMS.model;

import com.scaler.BMS.ShowSeat;
import com.scaler.BMS.model.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    private double totalAmount;
    private Date bookingTime;
    @ManyToOne
    private User bookedBy;
    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus status;
}
