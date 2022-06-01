package com.sofka.test;

import com.sofka.utilities.Serie;
import com.sofka.utilities.Videojuego;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Wandavision", "Marvel");
        series[2] = new Serie("Inhumanos", "Marvel");
        series[3] = new Serie("Superman", "DC COmics");
        series[4] = new Serie("Roswell", 3, "FOX");
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("God Of War", 11, "Aventura", "Sony");
        videojuegos[2] = new Videojuego("Prince Of Persia", 9, "Aventura", "Ubisoft");
        videojuegos[3] = new Videojuego("Mario Kart", 5);
        videojuegos[4] = new Videojuego("Tony Hawk", 14);

        videojuegos[3].entregar();
        videojuegos[2].entregar();
        series[0].entregar();
        series[4].entregar();

        logger.log(Level.INFO, "Número de Series Entregadas: {0}", countSeriesEntregadas(series));
        logger.log(Level.INFO, "Número de Videojuegos Entregados: {0}", countVideojuegosEntregados(videojuegos));

        logger.log(Level.INFO, "El Videojuego con más horas estimadas es: {0}", maxHorasVideojuegos(videojuegos));
        logger.log(Level.INFO, "La Serie con más Temporadas es: {0}", maxTemporadasSeries(series));

    }

    private static Integer countSeriesEntregadas(Serie[] series){
        Integer count = 0;
        for (Serie serie : series){
            if (Boolean.TRUE.equals(serie.isEntregado())){
                count++;
            }
        }
        return count;
    }

    private static Integer countVideojuegosEntregados(Videojuego[] videojuegos){
        Integer count = 0;
        for (Videojuego videojuego : videojuegos){
            if (Boolean.TRUE.equals(videojuego.isEntregado())){
                count++;
            }
        }
        return count;
    }

    private static Videojuego maxHorasVideojuegos(Videojuego[] videojuegos){
        Videojuego videojuego;
        videojuego = videojuegos[0];
        for (int i = 1; i < videojuegos.length; i++){
            if (videojuegos[i].getHorasEstimadas() > videojuego.getHorasEstimadas()){
                videojuego = videojuegos[i];
            }
        }
        return videojuego;
    }

    private static Serie maxTemporadasSeries(Serie[] series){
        Serie serie;
        serie = series[0];
        for (int i = 1; i < series.length; i++){
            if (series[i].getNumeroTemporadas() > serie.getNumeroTemporadas()){
                serie = series[i];
            }
        }
        return serie;
    }
}
