--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplLanguageManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplLanguageManagerImplProperties`
--
SELECT `langmgr.list.path`, `langmgr.country.default` FROM `comDayCqWcmCoreImplLanguageManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplLanguageManagerImplProperties`
--
INSERT INTO `comDayCqWcmCoreImplLanguageManagerImplProperties`(`langmgr.list.path`, `langmgr.country.default`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplLanguageManagerImplProperties`
--
UPDATE `comDayCqWcmCoreImplLanguageManagerImplProperties` SET `langmgr.list.path` = ?, `langmgr.country.default` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplLanguageManagerImplProperties`
--
DELETE FROM `comDayCqWcmCoreImplLanguageManagerImplProperties` WHERE 0;

