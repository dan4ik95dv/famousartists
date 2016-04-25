package com.github.dan4ik95dv.famousartists.io.adapter;


import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmDouble;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmLong;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import io.realm.RealmObject;

/**
 * Abstract implementation of {@link TypeAdapter} to be used by primitive classes being used with realm
 *
 * @param <T> of the primitive
 */
public abstract class AbstractRealmPrimitiveTypeAdapter<T extends RealmObject> extends TypeAdapter<T> {
    @Override
    public void write(JsonWriter out, T value) throws IOException {
        if (value == null) {
            out.nullValue();

            return;
        }

        writeAs(out, value);
    }

    /**
     * Writes value as T
     *
     * @param out   to write value to
     * @param value to write
     * @throws IOException if this writer is closed or another I/O error occurs.
     */
    protected abstract void writeAs(JsonWriter out, T value) throws IOException;

    @Override
    public T read(JsonReader in) throws IOException {
        return readAs(in);
    }

    /**
     * Reads value as T
     *
     * @param in to read value from
     * @return value of type T
     * @throws IOException on error
     */
    protected abstract T readAs(JsonReader in) throws IOException;

    /**
     * Type adapter for {@link RealmBoolean} {@link Boolean} wrapper
     */
    public static class RealmBooleanTypeAdapter extends AbstractRealmPrimitiveTypeAdapter<RealmBoolean> {

        @Override
        protected void writeAs(JsonWriter out, RealmBoolean value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        protected RealmBoolean readAs(JsonReader in) throws IOException {
            return new RealmBoolean(in.nextBoolean());
        }
    }

    /**
     * Type adapter for {@link RealmDouble} {@link Double} wrapper
     */
    public static class RealmDoubleTypeAdapter extends AbstractRealmPrimitiveTypeAdapter<RealmDouble> {

        @Override
        protected void writeAs(JsonWriter out, RealmDouble value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        protected RealmDouble readAs(JsonReader in) throws IOException {
            return new RealmDouble(in.nextDouble());
        }
    }

    /**
     * Type adapter for {@link RealmInteger} {@link Integer} wrapper
     */
    public static class RealmIntegerTypeAdapter extends AbstractRealmPrimitiveTypeAdapter<RealmInteger> {

        @Override
        protected void writeAs(JsonWriter out, RealmInteger value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        protected RealmInteger readAs(JsonReader in) throws IOException {
            return new RealmInteger(in.nextInt());
        }
    }

    /**
     * Type adapter for {@link RealmLong} {@link Long} wrapper
     */
    public static class RealmLongTypeAdapter extends AbstractRealmPrimitiveTypeAdapter<RealmLong> {

        @Override
        protected void writeAs(JsonWriter out, RealmLong value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        protected RealmLong readAs(JsonReader in) throws IOException {
            return new RealmLong(in.nextLong());
        }
    }

    /**
     * Type adapter for {@link RealmString} {@link String} wrapper
     */
    public static class RealmStringTypeAdapter extends AbstractRealmPrimitiveTypeAdapter<RealmString> {

        @Override
        protected void writeAs(JsonWriter out, RealmString value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        protected RealmString readAs(JsonReader in) throws IOException {
            return new RealmString(in.nextString());
        }
    }
}