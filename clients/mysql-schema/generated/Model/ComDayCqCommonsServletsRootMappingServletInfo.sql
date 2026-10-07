--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqCommonsServletsRootMappingServletInfo' definition.
--


--
-- SELECT template for table `comDayCqCommonsServletsRootMappingServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqCommonsServletsRootMappingServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqCommonsServletsRootMappingServletInfo`
--
INSERT INTO `comDayCqCommonsServletsRootMappingServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqCommonsServletsRootMappingServletInfo`
--
UPDATE `comDayCqCommonsServletsRootMappingServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqCommonsServletsRootMappingServletInfo`
--
DELETE FROM `comDayCqCommonsServletsRootMappingServletInfo` WHERE 0;

