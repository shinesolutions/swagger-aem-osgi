--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo`
--
INSERT INTO `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo`
--
UPDATE `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo`
--
DELETE FROM `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo` WHERE 0;

