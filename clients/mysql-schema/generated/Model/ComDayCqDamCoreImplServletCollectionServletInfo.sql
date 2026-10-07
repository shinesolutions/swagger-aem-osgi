--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCollectionServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCollectionServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletCollectionServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCollectionServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletCollectionServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCollectionServletInfo`
--
UPDATE `comDayCqDamCoreImplServletCollectionServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCollectionServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletCollectionServletInfo` WHERE 0;

