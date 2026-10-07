--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta'
--
SELECT pid, title, description, properties FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta WHERE 1=2;

