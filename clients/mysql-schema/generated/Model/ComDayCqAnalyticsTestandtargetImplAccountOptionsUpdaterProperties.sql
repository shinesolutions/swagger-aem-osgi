--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie`
--
SELECT `cq.analytics.testandtarget.accountoptionsupdater.enabled` FROM `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie`
--
INSERT INTO `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie`(`cq.analytics.testandtarget.accountoptionsupdater.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie`
--
UPDATE `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie` SET `cq.analytics.testandtarget.accountoptionsupdater.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie`
--
DELETE FROM `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertie` WHERE 0;

