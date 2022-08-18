1-SELECT country.country,city.city,city.country_id from country
LEFT JOIN city ON country.country_id=city.country_id
2-SELECT payment.payment_id, customer.first_name,customer.last_name FROM payment
RIGHT JOIN customer ON customer.customer_id=payment.customer_id 
3-SELECT rental.rental_id,customer.first_name,customer.last_name FROM customer
FULL JOIN rental ON rental.customer_id=customer.customer_id