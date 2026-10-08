--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMetadataGetServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletMetadataGetServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletMetadataGetServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletMetadataGetServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletMetadataGetServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletMetadataGetServletInfo`
--
UPDATE `comDayCqDamCoreImplServletMetadataGetServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletMetadataGetServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletMetadataGetServletInfo` WHERE 0;

