--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplCqMailingServiceInfo' definition.
--


--
-- SELECT template for table `comDayCqMailerImplCqMailingServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqMailerImplCqMailingServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplCqMailingServiceInfo`
--
INSERT INTO `comDayCqMailerImplCqMailingServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerImplCqMailingServiceInfo`
--
UPDATE `comDayCqMailerImplCqMailingServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplCqMailingServiceInfo`
--
DELETE FROM `comDayCqMailerImplCqMailingServiceInfo` WHERE 0;

