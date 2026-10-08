--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCommonsHttpclientInfo' definition.
--


--
-- SELECT template for table `comDayCommonsHttpclientInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCommonsHttpclientInfo` WHERE 1;

--
-- INSERT template for table `comDayCommonsHttpclientInfo`
--
INSERT INTO `comDayCommonsHttpclientInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCommonsHttpclientInfo`
--
UPDATE `comDayCommonsHttpclientInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCommonsHttpclientInfo`
--
DELETE FROM `comDayCommonsHttpclientInfo` WHERE 0;

