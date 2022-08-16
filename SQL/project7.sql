1-SELECT rating, COUNT(rating) FROM film
GROUP BY rating
2-SELECT replacement_cost, COUNT(replacement_cost) FROM film
GROUP BY replacement_cost
HAVING COUNT(replacement_cost)>50
ORDER BY count
3-SELECT store_id,COUNT(customer_id) from customer
GROUP BY store_id
4-SELECT country_id, COUNT(city) FROM city
GROUP BY country_id
ORDER BY count DESC
LIMIT 1

