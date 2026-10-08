--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo` WHERE 0;

