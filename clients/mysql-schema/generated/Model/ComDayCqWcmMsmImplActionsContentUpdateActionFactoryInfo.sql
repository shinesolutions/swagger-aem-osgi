--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo` WHERE 0;

