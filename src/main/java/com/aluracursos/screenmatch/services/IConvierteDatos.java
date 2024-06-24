package com.aluracursos.screenmatch.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
