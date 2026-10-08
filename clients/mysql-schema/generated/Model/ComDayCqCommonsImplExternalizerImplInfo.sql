--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqCommonsImplExternalizerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqCommonsImplExternalizerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqCommonsImplExternalizerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqCommonsImplExternalizerImplInfo`
--
INSERT INTO `comDayCqCommonsImplExternalizerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqCommonsImplExternalizerImplInfo`
--
UPDATE `comDayCqCommonsImplExternalizerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqCommonsImplExternalizerImplInfo`
--
DELETE FROM `comDayCqCommonsImplExternalizerImplInfo` WHERE 0;

