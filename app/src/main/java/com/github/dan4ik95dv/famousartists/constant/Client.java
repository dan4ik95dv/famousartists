package com.github.dan4ik95dv.famousartists.constant;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class Client {

    public static final String SECRET_KEY_LOOOOOOOOOOL = "XGRlBW9FXlekgbPrRHuSiA";
    public static final String BASE_URL = "http://download.cdn.yandex.net/mobilization-2016/";
    public static final String API_MUSIC_YANDEX = "https://music.yandex.ru/handlers/";
    public static final String API_MUSIC_YANDEX_V2 = "https://music.yandex.ru/api/v2.0/handlers/";
    public static final String BIG_IMG = "1000x1000";
    public static final String SMALL_IMG = "300x300";

    public static final class Search {
        public static final class Type {
            public static final String ARTIST = "artist";
            public static final String TRACK = "track";
            public static final String ALBUM = "album";
        }
    }

    public static final class Artist {
        public static final class Type {
            public static final String TRACKS = "track";
            public static final String ALBUMS = "album";
            public static final String SIMILAR = "similar";
        }
    }


    public static final class Timeout {
        public static final int CONNECT_TIMEOUT = 10;
        public static final int READ_TIMEOUT = 10;
        public static final int WRITE_TIMEOUT = 10;
    }


}
