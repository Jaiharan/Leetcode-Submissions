# Write your MySQL query statement below
-- Simple method
-- SELECT name from Customer WHERE referee_id != 2 or referee_id is null;

-- USING COALESCE, this initialize field with default value before execution
SELECT name FROM Customer WHERE COALESCE(referee_id, 0) != 2;