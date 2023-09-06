/* 1. Query a count of the number of cities in CITY having a Population larger than . */

SELECT COUNT(name)
FROM city
WHERE population > 100000;


/* 2. Query the total population of all cities in CITY where District is California. */

SELECT SUM(population)
FROM city
WHERE district = 'California';


/* 3. Query the average population of all cities in CITY where District is California. */

SELECT AVG(population)
FROM city
WHERE district = 'California';


/* 4. Query the average population for all cities in CITY, rounded down to the nearest integer. */

SELECT ROUND(AVG(population), 0)
FROM city;


/* 5. Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN. */

SELECT SUM(population)
FROM city
WHERE countrycode = "JPN";


/* 6. Query the difference between the maximum and minimum populations in CITY. */

SELECT (MAX(population) - MIN(population))
FROM city;


/* 7. Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, but did not realize her keyboard's  key was broken until after completing the calculation. She wants your help finding the difference between her miscalculation (using salaries with any zeros removed), and the actual average salary.
Write a query calculating the amount of error (i.e.: atual - miscalculated average monthly salaries), and round it up to the next integer. */

SELECT ROUND(AVG(salary)) - ROUND(AVG(REPLACE(salary, "0", "")))
FROM employees;


/* 8. We define an employee's total earnings to be their monthly salary x months worked, and the maximum total earnings to be the maximum total earnings for any employee in the Employee table. Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. Then print these values as 2 space-separated integers. */

SELECT (salary * months), COUNT(employee_id)
FROM employee
WHERE salary * months = (SELECT MAX(salary*months) FROM employee)
GROUP BY salary * months;


/* 9. Query the following two values from the STATION table:
- The sum of all values in LAT_N rounded to a scale of  decimal places.
- The sum of all values in LONG_W rounded to a scale of  decimal places. */

SELECT ROUND(SUM(lat_n), 2), ROUND(SUM(long_w), 2)
FROM station;


/* 10. Query the sum of Northern Latitudes (LAT_N) from STATION having values greater 38.7880 than  and less than 137.2345. Truncate your answer to 4 decimal places. */

SELECT ROUND(SUM(lat_n), 4)
FROM station
WHERE lat_n > 38.7880
   AND lat_n < 137.2345;


/* 11. Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345. Truncate your answer to  decimal places. */

SELECT ROUND(MAX(lat_n), 4)
FROM station
WHERE lat_n < 137.2345;


/* 12. Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345. Round your answer to 4 decimal places. */

SELECT ROUND(long_w, 4)
FROM station
WHERE lat_n = (SELECT MAX(lat_n)
        FROM station
        WHERE lat_n < 137.2345);


/* 13. Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.7780. Round your answer to 4 decimal places. */

SELECT ROUND(MIN(lat_n), 4)
FROM station
WHERE lat_n > 38.7780;


/* 14. Query the Western Longitude (LONG_W)where the smallest Northern Latitude (LAT_N) in STATION is greater than 38.7780. Round your answer to 4 decimal places. */

SELECT ROUND(long_w, 4)
FROM station
WHERE lat_n = (SELECT MIN(lat_n)
      FROM station
      WHERE lat_n > 38.7780);


/* 15. Consider P1(a,b) and P2(c,d) to be two points on a 2D plane.
 a happens to equal the minimum value in Northern Latitude (LAT_N in STATION).
 b happens to equal the minimum value in Western Longitude (LONG_W in STATION).
 c happens to equal the maximum value in Northern Latitude (LAT_N in STATION).
 d happens to equal the maximum value in Western Longitude (LONG_W in STATION).
Query the Manhattan Distance between points  and  and round it to a scale of 4 decimal places. */

SELECT ROUND((MAX(lat_n) - MIN(lat_n)) + 
       (MAX(long_w) - MIN(long_w)), 4)
FROM station;


/* 16. Consider P1(a,c) and P2(b,d) to be two points on a 2D plane where (a,b) are the respective minimum and maximum values of Northern Latitude (LAT_N) and (c,d) are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION.
Query the Euclidean Distance between points P1 and P2 and format your answer to display 4 decimal digits. */

SELECT ROUND(SQRT(POWER(MAX(lat_n) - MIN(lat_n), 2) + POWER(MAX(long_w) - MIN(long_w), 2)), 4)
FROM station;