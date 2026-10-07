--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplRolloutManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplRolloutManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comDayCqWcmMsmImplRolloutManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplRolloutManagerImplInfo`
--
INSERT INTO `comDayCqWcmMsmImplRolloutManagerImplInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplRolloutManagerImplInfo`
--
UPDATE `comDayCqWcmMsmImplRolloutManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplRolloutManagerImplInfo`
--
DELETE FROM `comDayCqWcmMsmImplRolloutManagerImplInfo` WHERE 0;

