--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert`
--
SELECT `service.ranking`, `tagpattern` FROM `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert` WHERE 1;

--
-- INSERT template for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert`
--
INSERT INTO `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert`(`service.ranking`, `tagpattern`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert`
--
UPDATE `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert` SET `service.ranking` = ?, `tagpattern` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert`
--
DELETE FROM `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropert` WHERE 0;

