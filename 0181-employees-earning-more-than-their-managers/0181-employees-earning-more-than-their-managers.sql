# Write your MySQL query statement below
select b.name as Employee
from Employee as a
inner join Employee as b
on a.id=b.managerId
where b.salary>a.salary;
