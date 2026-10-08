--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmCampaignImplIntegrationConfigImplProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmCampaignImplIntegrationConfigImplProperties`
--
SELECT `aem.mcm.campaign.formConstraints`, `aem.mcm.campaign.publicUrl`, `aem.mcm.campaign.relaxedSSL` FROM `comDayCqMcmCampaignImplIntegrationConfigImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMcmCampaignImplIntegrationConfigImplProperties`
--
INSERT INTO `comDayCqMcmCampaignImplIntegrationConfigImplProperties`(`aem.mcm.campaign.formConstraints`, `aem.mcm.campaign.publicUrl`, `aem.mcm.campaign.relaxedSSL`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmCampaignImplIntegrationConfigImplProperties`
--
UPDATE `comDayCqMcmCampaignImplIntegrationConfigImplProperties` SET `aem.mcm.campaign.formConstraints` = ?, `aem.mcm.campaign.publicUrl` = ?, `aem.mcm.campaign.relaxedSSL` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmCampaignImplIntegrationConfigImplProperties`
--
DELETE FROM `comDayCqMcmCampaignImplIntegrationConfigImplProperties` WHERE 0;

