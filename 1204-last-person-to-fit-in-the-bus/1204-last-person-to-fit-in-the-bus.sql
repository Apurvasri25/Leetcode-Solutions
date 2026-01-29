# Write your MySQL query statement below
select person_name
from(
    SELECT
        person_name,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) t
where total_weight<=1000
order by total_weight desc
limit 1;