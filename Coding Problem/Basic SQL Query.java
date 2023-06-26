//Join Example
select colum_name
from table_1
LEFT JOIN table_2 
ON table_1.colum_name = table_2.colum_name;

//Nth highest salary 
// 1. using LIMIT clause
select emp_name, salary
from table_name
ORDER BY salary DESC LIMIT N-1,1;

//DepartMent average salary
select dep_name, AVG(salary) As Average_salary
from table_name
Group By Department;

//Department Wise max salary
select dept_name, MAX(salary) As salary
from Department
Group By DepartMent

//find duplicate record from table
select name, id;
from table_name
GROUP BY name
HAVING COUNT(id)>1;