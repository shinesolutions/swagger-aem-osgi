--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerDefaultMailServiceInfo' definition.
--


--
-- SELECT template for table `comDayCqMailerDefaultMailServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqMailerDefaultMailServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCqMailerDefaultMailServiceInfo`
--
INSERT INTO `comDayCqMailerDefaultMailServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerDefaultMailServiceInfo`
--
UPDATE `comDayCqMailerDefaultMailServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerDefaultMailServiceInfo`
--
DELETE FROM `comDayCqMailerDefaultMailServiceInfo` WHERE 0;

