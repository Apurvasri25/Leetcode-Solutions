# Write your MySQL query statement below
select employee.name,Bonus.bonus from Employee  left join bonus  on Employee.empId=bonus.empId where bonus<1000 or bonus is null;