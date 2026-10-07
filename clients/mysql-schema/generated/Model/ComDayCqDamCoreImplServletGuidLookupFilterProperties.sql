--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletGuidLookupFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletGuidLookupFilterProperties`
--
SELECT `cq.dam.core.guidlookupfilter.enabled` FROM `comDayCqDamCoreImplServletGuidLookupFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletGuidLookupFilterProperties`
--
INSERT INTO `comDayCqDamCoreImplServletGuidLookupFilterProperties`(`cq.dam.core.guidlookupfilter.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletGuidLookupFilterProperties`
--
UPDATE `comDayCqDamCoreImplServletGuidLookupFilterProperties` SET `cq.dam.core.guidlookupfilter.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletGuidLookupFilterProperties`
--
DELETE FROM `comDayCqDamCoreImplServletGuidLookupFilterProperties` WHERE 0;

