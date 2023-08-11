/* HackerRank SQL Basic Tasks */

/* 1. Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA. */

SELECT * FROM city
WHERE countrycode = "USA"
   AND population > 100000;


/* 2. Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA. */

SELECT name
FROM city
WHERE countrycode = "USA"
   AND population > 120000;


/* 3. Query all columns (attributes) for every row in the CITY table. */

SELECT * FROM city;


/* 4. Query all columns for a city in CITY with the ID 1661. */

SELECT * FROM city
WHERE id = 1661;


/* 5. Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN. */

SELECT * FROM city
WHERE countrycode = "JPN";


/* 6. Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN. */

SELECT name FROM city
WHERE countrycode = "JPN";


/* 7. Query a list of CITY and STATE from the STATION table. */

SELECT city, state FROM station;


/* 8. Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer. */

SELECT DISTINCT city FROM station
WHERE ID % 2 = 0;


/* 9. Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table. */ 

SELECT COUNT(city) - COUNT(DISTINCT city)
FROM station;


/* 10. Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically. */

SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY), CITY
LIMIT 1;

SELECT CITY,LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY) DESC,
CITY LIMIT 1;


/* 11. Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE RIGHT(city, 1) IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 12. Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE LEFT(city, 1) IN ("a", "e", "i", "o", "u")
   AND RIGHT(city, 1) IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 13. Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE LEFT(city, 1) NOT IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 14. Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE RIGHT(city, 1) NOT IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 15. Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE LEFT(city, 1) NOT IN ("a", "e", "i", "o", "u")
  OR RIGHT(city, 1) NOT IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 16. Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates. */

SELECT DISTINCT city FROM station
WHERE LEFT(city, 1) NOT IN ("a", "e", "i", "o", "u")
  AND RIGHT(city, 1) NOT IN ("a", "e", "i", "o", "u")
ORDER BY city


/* 17. Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID. */

SELECT name FROM students
WHERE marks > 75
ORDER BY RIGHT(name, 3), id