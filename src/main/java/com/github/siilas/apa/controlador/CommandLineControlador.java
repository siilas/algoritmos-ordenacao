package com.github.siilas.apa.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.strategy.SortableStrategy;

@Component
public class CommandLineControlador {

    @Autowired
    private SortableStrategy sortableStrategy;
    
    public void executar() {
        
        for (Algoritmos algoritmo : Algoritmos.values()) {
            sortableStrategy.getStrategy(algoritmo).sort(null);
        }
    }
    
}
