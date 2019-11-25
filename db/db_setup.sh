#!/bin/bash

set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE countries;
    \connect countries;
    CREATE TABLE Country (id SERIAL PRIMARY KEY NOT NULL, countryName varchar(100) NOT NULL, population int NOT NULL );
EOSQL

