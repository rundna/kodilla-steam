package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


    public static void main(String args[]) {

        MovieStore showMovie = new MovieStore();
        List<List<String>> titleList = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry:showMovie.getMovies().entrySet()){
            titleList.add(entry.getValue());
            }

            String flatList = titleList.stream()
                        .flatMap(m->m.stream())
                        .collect(joining("!"));

            System.out.println(flatList);

    }
}
