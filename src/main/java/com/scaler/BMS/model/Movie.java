package com.scaler.BMS.model;

import com.scaler.BMS.model.enums.Feature;
import com.scaler.BMS.model.enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;

    @ManyToMany
    List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Genre> genres;

}
