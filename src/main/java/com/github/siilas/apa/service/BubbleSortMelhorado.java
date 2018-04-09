package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.model.Sorted;
import com.google.common.base.Stopwatch;

@Component
public class BubbleSortMelhorado implements Sortable {

    @Override
    public Sorted sort(Integer[] vetor) {
        Stopwatch time = Stopwatch.createStarted();
        
        time.stop();
        return null;
    }

}
