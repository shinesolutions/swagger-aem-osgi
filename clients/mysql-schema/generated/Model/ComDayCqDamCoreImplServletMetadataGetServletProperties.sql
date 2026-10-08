--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMetadataGetServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletMetadataGetServletProperties`
--
SELECT `sling.servlet.resourceTypes`, `sling.servlet.methods`, `sling.servlet.extensions`, `sling.servlet.selectors` FROM `comDayCqDamCoreImplServletMetadataGetServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletMetadataGetServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletMetadataGetServletProperties`(`sling.servlet.resourceTypes`, `sling.servlet.methods`, `sling.servlet.extensions`, `sling.servlet.selectors`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletMetadataGetServletProperties`
--
UPDATE `comDayCqDamCoreImplServletMetadataGetServletProperties` SET `sling.servlet.resourceTypes` = ?, `sling.servlet.methods` = ?, `sling.servlet.extensions` = ?, `sling.servlet.selectors` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletMetadataGetServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletMetadataGetServletProperties` WHERE 0;

