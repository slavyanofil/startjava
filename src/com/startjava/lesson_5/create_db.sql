-- create database

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    REAL,
    weight    INTEGER,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);