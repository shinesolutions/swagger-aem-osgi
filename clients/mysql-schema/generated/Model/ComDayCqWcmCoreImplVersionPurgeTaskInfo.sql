--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionPurgeTaskInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplVersionPurgeTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplVersionPurgeTaskInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplVersionPurgeTaskInfo`
--
INSERT INTO `comDayCqWcmCoreImplVersionPurgeTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplVersionPurgeTaskInfo`
--
UPDATE `comDayCqWcmCoreImplVersionPurgeTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplVersionPurgeTaskInfo`
--
DELETE FROM `comDayCqWcmCoreImplVersionPurgeTaskInfo` WHERE 0;

