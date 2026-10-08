--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplPollingImporterImplProperties' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplPollingImporterImplProperties`
--
SELECT `importer.min.interval`, `importer.user`, `exclude.paths`, `include.paths` FROM `comDayCqPollingImporterImplPollingImporterImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplPollingImporterImplProperties`
--
INSERT INTO `comDayCqPollingImporterImplPollingImporterImplProperties`(`importer.min.interval`, `importer.user`, `exclude.paths`, `include.paths`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqPollingImporterImplPollingImporterImplProperties`
--
UPDATE `comDayCqPollingImporterImplPollingImporterImplProperties` SET `importer.min.interval` = ?, `importer.user` = ?, `exclude.paths` = ?, `include.paths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplPollingImporterImplProperties`
--
DELETE FROM `comDayCqPollingImporterImplPollingImporterImplProperties` WHERE 0;

