--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo` WHERE 0;

