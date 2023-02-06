package com.scaler.BMS;

import com.scaler.BMS.model.BaseModel;
import com.scaler.BMS.model.Seat;
import com.scaler.BMS.model.Show;
import com.scaler.BMS.model.enums.ShowSeatState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatState showSeatState;
}
