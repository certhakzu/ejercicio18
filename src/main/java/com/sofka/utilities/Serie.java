package com.sofka.utilities;

import com.sofka.utilities.interfaces.Entregable;

public class Serie implements Entregable {
    private String titulo;
    private Integer numeroTemporadas;
    private Boolean entregado;
    private String creador;

    private static final Integer NUMERO_TEMPORADAS_DEFAULT = 3;
    private static final Boolean ENTREGADO_DEFAULT = false;
    private static final String TITULO_DEFAULT = "";
    private static final String CREADOR_DEFAULT = "";

    public Serie() {
        this.titulo = TITULO_DEFAULT;
        this.numeroTemporadas = NUMERO_TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.creador = CREADOR_DEFAULT;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = NUMERO_TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public Serie(String titulo, Integer numeroTemporadas, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Integer compareTo(Object a) {
        return this.compareTo(a);
    }
}
