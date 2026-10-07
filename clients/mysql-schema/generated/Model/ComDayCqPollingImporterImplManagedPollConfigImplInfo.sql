--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollConfigImplInfo' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplManagedPollConfigImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqPollingImporterImplManagedPollConfigImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplManagedPollConfigImplInfo`
--
INSERT INTO `comDayCqPollingImporterImplManagedPollConfigImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqPollingImporterImplManagedPollConfigImplInfo`
--
UPDATE `comDayCqPollingImporterImplManagedPollConfigImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplManagedPollConfigImplInfo`
--
DELETE FROM `comDayCqPollingImporterImplManagedPollConfigImplInfo` WHERE 0;

