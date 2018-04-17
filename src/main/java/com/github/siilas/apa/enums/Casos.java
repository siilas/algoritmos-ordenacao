package com.github.siilas.apa.enums;

import com.github.siilas.apa.model.GeradorAleatorio;
import com.github.siilas.apa.model.GeradorCrescente;
import com.github.siilas.apa.model.GeradorDeInformacoes;
import com.github.siilas.apa.model.GeradorDecrescente;

public enum Casos {
    
    CRESCENTE("Crescente", new GeradorCrescente()),
    ALEATORIO("Aleatório", new GeradorAleatorio()),
    DESCRECENTE("Decrescente", new GeradorDecrescente());
    
    private final String descricao;
    private final GeradorDeInformacoes gerador;
    
    private Casos(String descricao, GeradorDeInformacoes gerador) {
        this.descricao = descricao;
        this.gerador = gerador;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public GeradorDeInformacoes getGerador() {
        return gerador;
    }
    
}
