SELECT * FROM Jaegers;
SELECT * FROM Jaegers
WHERE status = 'Undestroyed';
SELECT * FROM Jaegers
WHERE mark = 'Mark-1'
   OR mark = 'Mark-6';
SELECT * FROM Jaegers
ORDER BY mark DESC;
SELECT * FROM Jaegers
WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers
WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers)
   OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijuKill = kaijuKill + 1
WHERE status = 'Undestroyed';
DELETE FROM Jaegers
WHERE status = 'Destroyed';