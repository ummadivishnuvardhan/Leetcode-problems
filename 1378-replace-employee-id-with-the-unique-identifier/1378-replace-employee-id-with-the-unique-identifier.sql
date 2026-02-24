select e1.unique_id as unique_id,e2.name as name
from EmployeeUNI e1 right join Employees e2
on e1.id=e2.id