--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_campaign_importer_personalized_text_handler_fact'
--
SELECT service/ranking, tagpattern FROM com_day_cq_mcm_campaign_importer_personalized_text_handler_fact WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_campaign_importer_personalized_text_handler_fact'
--
INSERT INTO com_day_cq_mcm_campaign_importer_personalized_text_handler_fact (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_campaign_importer_personalized_text_handler_fact'
--
UPDATE com_day_cq_mcm_campaign_importer_personalized_text_handler_fact SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_campaign_importer_personalized_text_handler_fact'
--
DELETE FROM com_day_cq_mcm_campaign_importer_personalized_text_handler_fact WHERE 1=2;

