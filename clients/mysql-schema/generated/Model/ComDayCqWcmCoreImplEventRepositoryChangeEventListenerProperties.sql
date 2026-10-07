--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties`
--
SELECT `paths`, `excludedPaths` FROM `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties`
--
INSERT INTO `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties`(`paths`, `excludedPaths`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties`
--
UPDATE `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties` SET `paths` = ?, `excludedPaths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties`
--
DELETE FROM `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties` WHERE 0;

