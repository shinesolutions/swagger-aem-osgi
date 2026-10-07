--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmCampaignImplIntegrationConfigImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_campaign_impl_integration_config_impl_properties'
--
SELECT aem/mcm/campaign/form_constraints, aem/mcm/campaign/public_url, aem/mcm/campaign/relaxed_ssl FROM com_day_cq_mcm_campaign_impl_integration_config_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_campaign_impl_integration_config_impl_properties'
--
INSERT INTO com_day_cq_mcm_campaign_impl_integration_config_impl_properties (aem/mcm/campaign/form_constraints, aem/mcm/campaign/public_url, aem/mcm/campaign/relaxed_ssl) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_campaign_impl_integration_config_impl_properties'
--
UPDATE com_day_cq_mcm_campaign_impl_integration_config_impl_properties SET aem/mcm/campaign/form_constraints = ?, aem/mcm/campaign/public_url = ?, aem/mcm/campaign/relaxed_ssl = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_campaign_impl_integration_config_impl_properties'
--
DELETE FROM com_day_cq_mcm_campaign_impl_integration_config_impl_properties WHERE 1=2;

