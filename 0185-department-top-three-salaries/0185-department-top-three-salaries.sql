# Write your MySQL query statement below
with cte as (
    select name as Employee, salary, departmentId, 
    dense_rank() over(partition by departmentId order by salary desc) as rnk
    from employee
    )

select d.name as Department, Employee, Salary
from cte e 
join department d 
on e.departmentId = d.id
where rnk <= 3 