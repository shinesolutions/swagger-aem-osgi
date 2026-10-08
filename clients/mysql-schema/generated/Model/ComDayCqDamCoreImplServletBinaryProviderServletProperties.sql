--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletBinaryProviderServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletBinaryProviderServletProperties`
--
SELECT `sling.servlet.resourceTypes`, `sling.servlet.methods`, `cq.dam.drm.enable` FROM `comDayCqDamCoreImplServletBinaryProviderServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletBinaryProviderServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletBinaryProviderServletProperties`(`sling.servlet.resourceTypes`, `sling.servlet.methods`, `cq.dam.drm.enable`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletBinaryProviderServletProperties`
--
UPDATE `comDayCqDamCoreImplServletBinaryProviderServletProperties` SET `sling.servlet.resourceTypes` = ?, `sling.servlet.methods` = ?, `cq.dam.drm.enable` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletBinaryProviderServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletBinaryProviderServletProperties` WHERE 0;

