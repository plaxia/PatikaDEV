1-SELECT * from film 
WHERE length>(SELECT avg(length) from film)
2-SELECT count(rental_rate) from film 
WHERE rental_rate=
(SELECT rental_rate
 from film
ORDER BY rental_rate DESC
LIMIT 1)
3-SELECT title,rental_rate,replacement_cost from film
WHERE rental_rate=(Select rental_rate from film
                  ORDER BY rental_rate ASC
                  LIMIT 1) AND replacement_cost=(SELECT replacement_cost
                                                from film ORDER BY replacement_cost ASC
                                                LIMIT 1)
4-
SELECT count(customer_id),(SELECT first_name from customer
                          WHERE customer.customer_id=payment.customer_id) from payment
GROUP BY customer_id
ORDER BY count(customer_id)DESC