--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCompanionServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCompanionServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletCompanionServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCompanionServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletCompanionServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCompanionServletInfo`
--
UPDATE `comDayCqDamCoreImplServletCompanionServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCompanionServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletCompanionServletInfo` WHERE 0;

