--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplVersionManagerImplProperties`
--
SELECT `versionmanager.createVersionOnActivation`, `versionmanager.purgingEnabled`, `versionmanager.purgePaths`, `versionmanager.ivPaths`, `versionmanager.maxAgeDays`, `versionmanager.maxNumberVersions`, `versionmanager.minNumberVersions` FROM `comDayCqWcmCoreImplVersionManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplVersionManagerImplProperties`
--
INSERT INTO `comDayCqWcmCoreImplVersionManagerImplProperties`(`versionmanager.createVersionOnActivation`, `versionmanager.purgingEnabled`, `versionmanager.purgePaths`, `versionmanager.ivPaths`, `versionmanager.maxAgeDays`, `versionmanager.maxNumberVersions`, `versionmanager.minNumberVersions`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplVersionManagerImplProperties`
--
UPDATE `comDayCqWcmCoreImplVersionManagerImplProperties` SET `versionmanager.createVersionOnActivation` = ?, `versionmanager.purgingEnabled` = ?, `versionmanager.purgePaths` = ?, `versionmanager.ivPaths` = ?, `versionmanager.maxAgeDays` = ?, `versionmanager.maxNumberVersions` = ?, `versionmanager.minNumberVersions` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplVersionManagerImplProperties`
--
DELETE FROM `comDayCqWcmCoreImplVersionManagerImplProperties` WHERE 0;

