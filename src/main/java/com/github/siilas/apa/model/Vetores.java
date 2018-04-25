package com.github.siilas.apa.model;

import java.util.ArrayList;
import java.util.List;

import com.github.siilas.apa.enums.Casos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vetores {

    private Casos caso;
    private List<Vetor> vetores = new ArrayList<>();
    
}
