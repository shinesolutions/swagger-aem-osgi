--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplLanguageManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplLanguageManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplLanguageManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplLanguageManagerImplInfo`
--
INSERT INTO `comDayCqWcmCoreImplLanguageManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplLanguageManagerImplInfo`
--
UPDATE `comDayCqWcmCoreImplLanguageManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplLanguageManagerImplInfo`
--
DELETE FROM `comDayCqWcmCoreImplLanguageManagerImplInfo` WHERE 0;

