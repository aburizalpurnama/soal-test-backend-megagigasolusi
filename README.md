# soal-test-backend-megagigasolusi
Soal test Back End Developer PT. Mega Giga Solusi

# Docker Compose Config
version: '3.3'

services:

db:
image: mysql:8
restart: always
environment:
MYSQL_DATABASE: 'db'
MYSQL_USER: 'user'
MYSQL_PASSWORD: 'password'
MYSQL_ROOT_PASSWORD: 'password'
ports: 3306:3306
volumes: db:/var/lib/mysql

adminer:
image: adminer
restart: always
ports:
- 8080:8080

volumes:
db:

# Run Docker Compose
On root project directory: sudo docker-compose up

# Step by Step
1. set up configuration on application.properties

create database db;
