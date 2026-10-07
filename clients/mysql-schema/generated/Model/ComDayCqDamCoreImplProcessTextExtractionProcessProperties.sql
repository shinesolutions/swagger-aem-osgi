--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplProcessTextExtractionProcessProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplProcessTextExtractionProcessProperties`
--
SELECT `mimeTypes`, `maxExtract` FROM `comDayCqDamCoreImplProcessTextExtractionProcessProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplProcessTextExtractionProcessProperties`
--
INSERT INTO `comDayCqDamCoreImplProcessTextExtractionProcessProperties`(`mimeTypes`, `maxExtract`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplProcessTextExtractionProcessProperties`
--
UPDATE `comDayCqDamCoreImplProcessTextExtractionProcessProperties` SET `mimeTypes` = ?, `maxExtract` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplProcessTextExtractionProcessProperties`
--
DELETE FROM `comDayCqDamCoreImplProcessTextExtractionProcessProperties` WHERE 0;

