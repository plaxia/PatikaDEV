1-SELECT AVG(rental_rate) from film
2-SELECT COUNT(title)  from film
WHERE title LIKE 'C%'
3-SELECT MAX(length)  from film
WHERE rental_rate=0.99
4-SELECT COUNT(DISTINCT(replacement_cost)) from film
WHERE length>150