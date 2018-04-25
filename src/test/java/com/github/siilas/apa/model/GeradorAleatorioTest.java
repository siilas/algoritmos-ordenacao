package com.github.siilas.apa.model;

import java.util.Arrays;
import java.util.Collections;

import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GeradorAleatorioTest implements GeradorDeInformacoesTest {

    private GeradorAleatorio gerador;
    
    @Before
    public void init() {
        gerador = new GeradorAleatorio();
    }
    
    @Test
    @Override
    public void deveValidarVetorGerado() {
        Vetores vetores = gerador.gerarVetores();
        for (Vetor vetor : vetores.getVetores()) {
            Integer[] notExpectedCrescente = vetor.getVetorOriginal().clone();
            Integer[] notExpectedDecrescente = vetor.getVetorOriginal().clone();
            Arrays.sort(notExpectedCrescente);
            Arrays.sort(notExpectedDecrescente, Collections.reverseOrder());
            Assert.assertThat(vetor.getVetorOriginal(), IsNot.not(notExpectedCrescente));
            Assert.assertThat(vetor.getVetorOriginal(), IsNot.not(notExpectedDecrescente));
        }
    }

}
