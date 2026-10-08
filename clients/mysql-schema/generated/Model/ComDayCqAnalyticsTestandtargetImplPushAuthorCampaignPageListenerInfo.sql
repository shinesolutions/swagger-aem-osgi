--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener`
--
INSERT INTO `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener`
--
UPDATE `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener`
--
DELETE FROM `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener` WHERE 0;

