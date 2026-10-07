--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo'
--
SELECT pid, title, description, properties FROM com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_compo WHERE 1=2;

