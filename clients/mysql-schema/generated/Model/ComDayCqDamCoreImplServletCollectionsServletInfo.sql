--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCollectionsServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCollectionsServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletCollectionsServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCollectionsServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletCollectionsServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCollectionsServletInfo`
--
UPDATE `comDayCqDamCoreImplServletCollectionsServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCollectionsServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletCollectionsServletInfo` WHERE 0;

