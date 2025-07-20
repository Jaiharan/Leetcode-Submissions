# Write your MySQL query statement below
-- select w1.id from Weather w1 join Weather w2 on DateDiff(w1.recordDate, w2.recordDate) = 1 where w1.temperature > w2.temperature; 

-- with previousWeatherData as (
--     select id, recordDate, temperature, lag(temperature, 1) over (order by recordDate) as previousTemperature, lag(recordDate, 1) over (order by recordDate) as previousRecordDate from Weather
-- )

-- select id from previousWeatherData where temperature > previousTemperature and recordDate = DATE_ADD(previousRecordDate, interval 1 day);



SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;