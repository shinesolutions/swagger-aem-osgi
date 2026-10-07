--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollConfigImplProperties' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplManagedPollConfigImplProperties`
--
SELECT `id`, `enabled`, `reference`, `interval`, `expression`, `source`, `target`, `login`, `password` FROM `comDayCqPollingImporterImplManagedPollConfigImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplManagedPollConfigImplProperties`
--
INSERT INTO `comDayCqPollingImporterImplManagedPollConfigImplProperties`(`id`, `enabled`, `reference`, `interval`, `expression`, `source`, `target`, `login`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqPollingImporterImplManagedPollConfigImplProperties`
--
UPDATE `comDayCqPollingImporterImplManagedPollConfigImplProperties` SET `id` = ?, `enabled` = ?, `reference` = ?, `interval` = ?, `expression` = ?, `source` = ?, `target` = ?, `login` = ?, `password` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplManagedPollConfigImplProperties`
--
DELETE FROM `comDayCqPollingImporterImplManagedPollConfigImplProperties` WHERE 0;

