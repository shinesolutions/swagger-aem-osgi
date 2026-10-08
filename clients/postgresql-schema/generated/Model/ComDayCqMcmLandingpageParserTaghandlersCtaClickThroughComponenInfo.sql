--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
SELECT pid, title, description, properties FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through WHERE 1=2;

