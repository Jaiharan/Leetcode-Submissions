# Write your MySQL query statement below
SELECT name from Customer WHERE referee_id != 2 or referee_id is null;
-- SELECT name FROM Customer WHERE COALESCE(referee_id, 0) <> 2;