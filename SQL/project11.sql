1-(
SELECT first_name from actor
)
UNION
(
SELECT first_name from customer
);
2-(
SELECT first_name from actor
)
INTERSECT
(
SELECT first_name from customer
);
3-(
SELECT first_name from actor
)
EXCEPT
(
SELECT first_name from customer
);
4-
(
SELECT first_name from actor
)
UNION ALL
(
SELECT first_name from customer
);

(
SELECT first_name from actor
)
INTERSECT ALL
(
SELECT first_name from customer
);

(
SELECT first_name from actor
)
EXCEPT ALL
(
SELECT first_name from customer
);