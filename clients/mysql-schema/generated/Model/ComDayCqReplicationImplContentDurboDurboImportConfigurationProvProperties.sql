--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP`
--
SELECT `preserve.hierarchy.nodes`, `ignore.versioning`, `import.acl`, `save.threshold`, `preserve.user.paths`, `preserve.uuid`, `preserve.uuid.nodetypes`, `preserve.uuid.subtrees`, `auto.commit` FROM `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP`
--
INSERT INTO `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP`(`preserve.hierarchy.nodes`, `ignore.versioning`, `import.acl`, `save.threshold`, `preserve.user.paths`, `preserve.uuid`, `preserve.uuid.nodetypes`, `preserve.uuid.subtrees`, `auto.commit`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP`
--
UPDATE `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP` SET `preserve.hierarchy.nodes` = ?, `ignore.versioning` = ?, `import.acl` = ?, `save.threshold` = ?, `preserve.user.paths` = ?, `preserve.uuid` = ?, `preserve.uuid.nodetypes` = ?, `preserve.uuid.subtrees` = ?, `auto.commit` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP`
--
DELETE FROM `comDayCqReplicationImplContentDurboDurboImportConfigurationProvP` WHERE 0;

