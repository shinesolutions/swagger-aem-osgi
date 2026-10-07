--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletResourceCollectionServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletResourceCollectionServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletResourceCollectionServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletResourceCollectionServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletResourceCollectionServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletResourceCollectionServletInfo`
--
UPDATE `comDayCqDamCoreImplServletResourceCollectionServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletResourceCollectionServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletResourceCollectionServletInfo` WHERE 0;

