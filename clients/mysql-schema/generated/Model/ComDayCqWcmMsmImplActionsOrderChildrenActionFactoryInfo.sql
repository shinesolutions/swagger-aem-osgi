--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo` WHERE 0;

