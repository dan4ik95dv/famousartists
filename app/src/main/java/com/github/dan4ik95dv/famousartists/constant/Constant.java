package com.github.dan4ik95dv.famousartists.constant;

import java.util.HashMap;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https,//github.com/dan4ik95dv/famousartists
 */
public class Constant {

    static HashMap<String, String> typeGenre = new HashMap<>();

    static {
        typeGenre.put("all", "Всё");
        typeGenre.put("pop", "Поп");
        typeGenre.put("indie", "Инди");
        typeGenre.put("rock", "Рок");
        typeGenre.put("metal", "Метал");
        typeGenre.put("alternative", "Альтернатива");
        typeGenre.put("electronics", "Электроника");
        typeGenre.put("electronic", "Электроника");
        typeGenre.put("dance", "Танцевальная");
        typeGenre.put("rap", "Рэп и хип-хоп");
        typeGenre.put("hip-hop", "Рэп и хип-хоп");
        typeGenre.put("rnb", "R&B");
        typeGenre.put("r-n-b", "R&B");
        typeGenre.put("jazz", "Джаз");
        typeGenre.put("blues", "Блюз");
        typeGenre.put("reggae", "Регги");
        typeGenre.put("ska", "Ска");
        typeGenre.put("punk", "Панк");
        typeGenre.put("folk", "Музыка мира");
        typeGenre.put("world", "Музыка мира");
        typeGenre.put("classical", "Классика");
        typeGenre.put("estrada", "Эстрада");
        typeGenre.put("shanson", "Шансон");
        typeGenre.put("country", "Кантри");
        typeGenre.put("soundtrack", "Саундтреки");
        typeGenre.put("relax", "Лёгкая музыка");
        typeGenre.put("easy", "Лёгкая музыка");
        typeGenre.put("bard", "Авторская песня");
        typeGenre.put("singer-songwriter", "Авторская песня");
        typeGenre.put("children", "Детская");
        typeGenre.put("other", "Другое");
        typeGenre.put("disco", "Диско");
        typeGenre.put("local-indie", "Местное");
        typeGenre.put("rusrock", "Русский рок");
        typeGenre.put("rnr", "Рок-н-ролл");
        typeGenre.put("rock-n-roll", "Рок-н-ролл");
        typeGenre.put("prog", "Прогрессивный рок");
        typeGenre.put("prog-rock", "Прогрессивный рок");
        typeGenre.put("postrock", "Пост-рок");
        typeGenre.put("post-rock", "Пост-рок");
        typeGenre.put("newwave", "New Wave");
        typeGenre.put("new-wave", "New Wave");
        typeGenre.put("ukrrock", "Украинский рок");
        typeGenre.put("dubstep", "Дабстеп");
        typeGenre.put("industrial", "Индастриал");
        typeGenre.put("experimental", "Экспериментальная");
        typeGenre.put("house", "Хаус");
        typeGenre.put("techno", "Техно");
        typeGenre.put("trance", "Транс");
        typeGenre.put("dnb", "Драм-н-бэйс");
        typeGenre.put("drum-n-bass", "Драм-н-бэйс");
        typeGenre.put("rusrap", "Русский рэп");
        typeGenre.put("urban", "R&B и Урбан");
        typeGenre.put("soul", "Соул");
        typeGenre.put("funk", "Фанк");
        typeGenre.put("tradjazz", "Традиционный");
        typeGenre.put("trad-jass", "Традиционный");
        typeGenre.put("conjazz", "Современный");
        typeGenre.put("modern-jazz", "Современный");
        typeGenre.put("reggaeton", "Реггетон");
        typeGenre.put("dub", "Даб");
        typeGenre.put("hardcore", "Хардкор");
        typeGenre.put("rusfolk", "Русская");
        typeGenre.put("russian", "Русская");
        typeGenre.put("tatar", "Татарская");
        typeGenre.put("celtic", "Кельтская");
        typeGenre.put("balkan", "Балканская");
        typeGenre.put("eurofolk", "Европейская");
        typeGenre.put("european", "Европейская");
        typeGenre.put("jewish", "Еврейская");
        typeGenre.put("eastern", "Восточная");
        typeGenre.put("african", "Африканская");
        typeGenre.put("latinfolk", "Латиноамериканская");
        typeGenre.put("latin-american", "Латиноамериканская");
        typeGenre.put("amerfolk", "Американская");
        typeGenre.put("american", "Американская");
        typeGenre.put("vocal", "Вокал");
        typeGenre.put("opera", "Вокал");
        typeGenre.put("modern", "Современная классика");
        typeGenre.put("modern-classical", "Современная классика");
        typeGenre.put("films", "Из фильмов");
        typeGenre.put("tvseries", "Из сериалов");
        typeGenre.put("tv-series", "Из сериалов");
        typeGenre.put("animated", "Из мультфильмов");
        typeGenre.put("animated-films", "Из мультфильмов");
        typeGenre.put("videogame", "Из видеоигр");
        typeGenre.put("videogame-music", "Из видеоигр");
        typeGenre.put("musical", "Мюзиклы");
        typeGenre.put("bollywood", "Болливуд");
        typeGenre.put("lounge", "Лаунж");
        typeGenre.put("newage", "Нью-эйдж");
        typeGenre.put("new-age", "Нью-эйдж");
        typeGenre.put("meditation", "Медитация");
        typeGenre.put("meditative", "Медитация");
        typeGenre.put("rusbards", "Русская");
        typeGenre.put("romances", "Романсы");
        typeGenre.put("sport", "Спортивная");
        typeGenre.put("holiday", "Праздничная");
    }

    public static String getGenreName(String type) {
        String genre = typeGenre.get(type);
        return genre != null ? genre : type;
    }
}
