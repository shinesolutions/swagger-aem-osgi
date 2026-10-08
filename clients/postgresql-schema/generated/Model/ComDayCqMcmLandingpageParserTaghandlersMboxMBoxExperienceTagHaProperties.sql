--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi'
--
SELECT service/ranking, tagpattern FROM com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experi WHERE 1=2;

