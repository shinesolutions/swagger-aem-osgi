--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
SELECT service/ranking, tagpattern, component/resource_type FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through (service/ranking, tagpattern, component/resource_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through SET service/ranking = ?, tagpattern = ?, component/resource_type = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through WHERE 1=2;

