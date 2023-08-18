/* 1. Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/

SELECT SUM(city.population)
FROM city
JOIN country ON city.countrycode = country.code
WHERE continent = 'Asia'


/* Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/

SELECT city.name
FROM city
JOIN country
ON city.countrycode = country.code
WHERE continent = "Africa"
ORDER BY city.name