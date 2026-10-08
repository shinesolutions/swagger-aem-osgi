--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionPurgeTaskProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplVersionPurgeTaskProperties`
--
SELECT `versionpurge.paths`, `versionpurge.recursive`, `versionpurge.maxVersions`, `versionpurge.minVersions`, `versionpurge.maxAgeDays` FROM `comDayCqWcmCoreImplVersionPurgeTaskProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplVersionPurgeTaskProperties`
--
INSERT INTO `comDayCqWcmCoreImplVersionPurgeTaskProperties`(`versionpurge.paths`, `versionpurge.recursive`, `versionpurge.maxVersions`, `versionpurge.minVersions`, `versionpurge.maxAgeDays`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplVersionPurgeTaskProperties`
--
UPDATE `comDayCqWcmCoreImplVersionPurgeTaskProperties` SET `versionpurge.paths` = ?, `versionpurge.recursive` = ?, `versionpurge.maxVersions` = ?, `versionpurge.minVersions` = ?, `versionpurge.maxAgeDays` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplVersionPurgeTaskProperties`
--
DELETE FROM `comDayCqWcmCoreImplVersionPurgeTaskProperties` WHERE 0;

