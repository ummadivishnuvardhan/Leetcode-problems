# Write your MySQL query statement below
select e1.name,e2.bonus from Bonus as e2 right join Employee as e1 on e1.empId=e2.empId where e2.bonus is null or e2.bonus<1000;