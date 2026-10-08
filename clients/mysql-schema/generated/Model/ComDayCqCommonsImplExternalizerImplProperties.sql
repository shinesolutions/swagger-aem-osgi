--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqCommonsImplExternalizerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqCommonsImplExternalizerImplProperties`
--
SELECT `externalizer.domains`, `externalizer.host`, `externalizer.contextpath`, `externalizer.encodedpath` FROM `comDayCqCommonsImplExternalizerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqCommonsImplExternalizerImplProperties`
--
INSERT INTO `comDayCqCommonsImplExternalizerImplProperties`(`externalizer.domains`, `externalizer.host`, `externalizer.contextpath`, `externalizer.encodedpath`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqCommonsImplExternalizerImplProperties`
--
UPDATE `comDayCqCommonsImplExternalizerImplProperties` SET `externalizer.domains` = ?, `externalizer.host` = ?, `externalizer.contextpath` = ?, `externalizer.encodedpath` = ? WHERE 1;

--
-- DELETE template for table `comDayCqCommonsImplExternalizerImplProperties`
--
DELETE FROM `comDayCqCommonsImplExternalizerImplProperties` WHERE 0;

