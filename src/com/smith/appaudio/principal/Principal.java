package com.smith.appaudio.principal;

import com.smith.appaudio.modelos.Cancion;
import com.smith.appaudio.modelos.MisFavoritos;
import com.smith.appaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 1000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 15000; i++) {
            miCancion.reproducir();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total Reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos miFavorito = new MisFavoritos();
        miFavorito.adicione(miPodcast);
        miFavorito.adicione(miCancion);

    }
}
