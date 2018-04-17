package com.github.siilas.apa.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShellSortTest implements SortableTest {

    private ShellSort service;
    
    @Before
    public void init() {
        service = new ShellSort();
    }
    
    @Test
    @Override
    public void deveOrdenarNumerosAleatorios() {
        Integer[] vetorOrdenado = service.specificSort(ARRAY_ALEATORIO);
        Assert.assertArrayEquals(ARRAY_ORDENADO, vetorOrdenado); 
    }
    
    @Test
    @Override
    public void deveOrdenarNumerosCrescentes() {
        Integer[] vetorOrdenado = service.specificSort(ARRAY_CRESCENTE);
        Assert.assertArrayEquals(ARRAY_ORDENADO, vetorOrdenado); 
    }
    
    @Test
    @Override
    public void deveOrdenarNumerosDecrescentes() {
        Integer[] vetorOrdenado = service.specificSort(ARRAY_DECRESCENTE);
        Assert.assertArrayEquals(ARRAY_ORDENADO, vetorOrdenado); 
    }
    
}
