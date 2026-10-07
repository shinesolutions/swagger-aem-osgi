--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollingImporterImplInfo' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplManagedPollingImporterImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqPollingImporterImplManagedPollingImporterImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplManagedPollingImporterImplInfo`
--
INSERT INTO `comDayCqPollingImporterImplManagedPollingImporterImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqPollingImporterImplManagedPollingImporterImplInfo`
--
UPDATE `comDayCqPollingImporterImplManagedPollingImporterImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplManagedPollingImporterImplInfo`
--
DELETE FROM `comDayCqPollingImporterImplManagedPollingImporterImplInfo` WHERE 0;

