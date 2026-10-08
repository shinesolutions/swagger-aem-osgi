--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplVersionManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplVersionManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplVersionManagerImplInfo`
--
INSERT INTO `comDayCqWcmCoreImplVersionManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplVersionManagerImplInfo`
--
UPDATE `comDayCqWcmCoreImplVersionManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplVersionManagerImplInfo`
--
DELETE FROM `comDayCqWcmCoreImplVersionManagerImplInfo` WHERE 0;

