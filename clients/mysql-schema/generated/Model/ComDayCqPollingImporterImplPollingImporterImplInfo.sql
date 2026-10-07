--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqPollingImporterImplPollingImporterImplInfo' definition.
--


--
-- SELECT template for table `comDayCqPollingImporterImplPollingImporterImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqPollingImporterImplPollingImporterImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqPollingImporterImplPollingImporterImplInfo`
--
INSERT INTO `comDayCqPollingImporterImplPollingImporterImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqPollingImporterImplPollingImporterImplInfo`
--
UPDATE `comDayCqPollingImporterImplPollingImporterImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqPollingImporterImplPollingImporterImplInfo`
--
DELETE FROM `comDayCqPollingImporterImplPollingImporterImplInfo` WHERE 0;

