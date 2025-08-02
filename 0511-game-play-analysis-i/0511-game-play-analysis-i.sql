# Write your MySQL query statement below
-- select distinct e1.player_id,e1.event_date from Activity e1 join Activity e2
-- on DATEDIFF(e1.event_date,e2.event_date)>=1;

select player_id,MIN(event_date) as first_login from Activity group by player_id;