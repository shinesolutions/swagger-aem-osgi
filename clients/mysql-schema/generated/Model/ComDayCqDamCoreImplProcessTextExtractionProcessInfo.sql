--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplProcessTextExtractionProcessInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplProcessTextExtractionProcessInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplProcessTextExtractionProcessInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplProcessTextExtractionProcessInfo`
--
INSERT INTO `comDayCqDamCoreImplProcessTextExtractionProcessInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplProcessTextExtractionProcessInfo`
--
UPDATE `comDayCqDamCoreImplProcessTextExtractionProcessInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplProcessTextExtractionProcessInfo`
--
DELETE FROM `comDayCqDamCoreImplProcessTextExtractionProcessInfo` WHERE 0;

