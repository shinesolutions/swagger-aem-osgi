--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties`
--
SELECT `cq.dam.drm.enable` FROM `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties`(`cq.dam.drm.enable`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties`
--
UPDATE `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties` SET `cq.dam.drm.enable` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties` WHERE 0;

