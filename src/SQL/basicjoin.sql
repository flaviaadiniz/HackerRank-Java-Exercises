/* 1. Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/

SELECT SUM(city.population)
FROM city
JOIN country ON city.countrycode = country.code
WHERE continent = 'Asia';


/* 2. Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/

SELECT city.name
FROM city
JOIN country
ON city.countrycode = country.code
WHERE continent = "Africa"
ORDER BY city.name;


/* 3. Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/

SELECT DISTINCT country.continent, FLOOR(AVG(city.population))
FROM country
JOIN city
ON country.code = city.countrycode
GROUP BY continent;


/* 4. You are given two tables: Students and Grades. Students contains three columns ID, Name and Marks.
Grades contains the following columns: Grade, Min_Mark and Max_Mark
Ketty gives Eve a task to generate a report containing three columns: Name, Grade and Mark. Ketty doesn't want the NAMES of those students who received a grade lower than 8. The report must be in descending order by grade -- i.e. higher grades are entered first. If there is more than one student with the same grade (8-10) assigned to them, order those particular students by their name alphabetically. Finally, if the grade is lower than 8, use "NULL" as their name and list them by their grades in descending order. If there is more than one student with the same grade (1-7) assigned to them, order those particular students by their marks in ascending order.

Write a query to help Eve. */

SELECT CASE
    WHEN grade > 7 THEN name
    ELSE null
END AS n, grade, marks FROM students s
JOIN grades g ON s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY grade desc, name;


/* 5. Julia just finished conducting a coding contest, and she needs your help assembling the leaderboard! Write a query to print the respective hacker_id and name of hackers who achieved full scores for more than one challenge. Order your output in descending order by the total number of challenges in which the hacker earned a full score. If more than one hacker received full scores in same number of challenges, then sort them by ascending hacker_id. */

SELECT submissions.hacker_id, hackers.name
FROM submissions
JOIN hackers
    ON hackers.hacker_id = submissions.hacker_id
JOIN challenges
    ON submissions.challenge_id = challenges.challenge_id
JOIN difficulty
    ON difficulty.difficulty_level = challenges.difficulty_level
WHERE submissions.score = difficulty.score
GROUP BY hacker_id, hackers.name
    HAVING COUNT(hackers.name) > 1
ORDER BY COUNT(hackers.name) DESC, hacker_id;