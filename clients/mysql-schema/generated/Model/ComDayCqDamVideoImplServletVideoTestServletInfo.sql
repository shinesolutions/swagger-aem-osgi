--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamVideoImplServletVideoTestServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamVideoImplServletVideoTestServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqDamVideoImplServletVideoTestServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamVideoImplServletVideoTestServletInfo`
--
INSERT INTO `comDayCqDamVideoImplServletVideoTestServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamVideoImplServletVideoTestServletInfo`
--
UPDATE `comDayCqDamVideoImplServletVideoTestServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamVideoImplServletVideoTestServletInfo`
--
DELETE FROM `comDayCqDamVideoImplServletVideoTestServletInfo` WHERE 0;

