--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo` WHERE 0;

