--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplLightboxLightboxServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplLightboxLightboxServletProperties`
--
SELECT `sling.servlet.paths`, `sling.servlet.methods`, `cq.dam.enable.anonymous` FROM `comDayCqDamCoreImplLightboxLightboxServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplLightboxLightboxServletProperties`
--
INSERT INTO `comDayCqDamCoreImplLightboxLightboxServletProperties`(`sling.servlet.paths`, `sling.servlet.methods`, `cq.dam.enable.anonymous`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplLightboxLightboxServletProperties`
--
UPDATE `comDayCqDamCoreImplLightboxLightboxServletProperties` SET `sling.servlet.paths` = ?, `sling.servlet.methods` = ?, `cq.dam.enable.anonymous` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplLightboxLightboxServletProperties`
--
DELETE FROM `comDayCqDamCoreImplLightboxLightboxServletProperties` WHERE 0;

