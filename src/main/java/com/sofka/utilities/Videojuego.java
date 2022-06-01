package com.sofka.utilities;

import com.sofka.utilities.interfaces.Entregable;

public class Videojuego implements Entregable {
    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    private static final Integer HORAS_ESTIMADAS_DEFAULT = 10;
    private static final Boolean ENREGADO_DEFAULT = false;
    private static final String TITULO_DEFAULT = "";
    private static final String GENERO_DEFAULT = "";
    private static final String COMPANIA_DEFAULT = "";

    public Videojuego() {
        this.titulo = TITULO_DEFAULT;
        this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
        this.entregado = ENREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.compania = COMPANIA_DEFAULT;
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.compania = COMPANIA_DEFAULT;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
