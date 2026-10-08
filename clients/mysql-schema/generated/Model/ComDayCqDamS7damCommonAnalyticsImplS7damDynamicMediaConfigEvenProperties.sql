--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties' definition.
--


--
-- SELECT template for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr`
--
SELECT `cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled` FROM `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr` WHERE 1;

--
-- INSERT template for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr`
--
INSERT INTO `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr`(`cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr`
--
UPDATE `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr` SET `cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr`
--
DELETE FROM `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPr` WHERE 0;

