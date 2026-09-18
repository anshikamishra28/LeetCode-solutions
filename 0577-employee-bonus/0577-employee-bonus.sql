# Write your MySQL query statement below
select Employee.name,Bonus.bonus
from Employee
left join bonus
on Employee.empId=Bonus.empId
where bonus<1000 or Bonus.bonus is Null