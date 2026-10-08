--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCompanionServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCompanionServletProperties`
--
SELECT `More Info`, `/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}` FROM `comDayCqDamCoreImplServletCompanionServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCompanionServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletCompanionServletProperties`(`More Info`, `/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCompanionServletProperties`
--
UPDATE `comDayCqDamCoreImplServletCompanionServletProperties` SET `More Info` = ?, `/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCompanionServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletCompanionServletProperties` WHERE 0;

