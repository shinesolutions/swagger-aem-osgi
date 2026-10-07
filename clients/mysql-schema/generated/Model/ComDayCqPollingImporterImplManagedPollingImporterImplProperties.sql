--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollingImporterImplProperties' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplManagedPollingImporterImplProperties`
--
SELECT `importer.user` FROM `comDayCqPollingImporterImplManagedPollingImporterImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplManagedPollingImporterImplProperties`
--
INSERT INTO `comDayCqPollingImporterImplManagedPollingImporterImplProperties`(`importer.user`) VALUES (?);

--
-- UPDATE template for table `comDayCqPollingImporterImplManagedPollingImporterImplProperties`
--
UPDATE `comDayCqPollingImporterImplManagedPollingImporterImplProperties` SET `importer.user` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplManagedPollingImporterImplProperties`
--
DELETE FROM `comDayCqPollingImporterImplManagedPollingImporterImplProperties` WHERE 0;

