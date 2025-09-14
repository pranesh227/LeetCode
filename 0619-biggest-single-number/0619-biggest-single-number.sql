select coalesce (
(
SELECT MAX(num)
FROM MyNumbers
GROUP BY num
HAVING COUNT(num) = 1
order by num desc
limit 1),null) as num;


