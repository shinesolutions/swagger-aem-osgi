--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli'
--
SELECT service/ranking, tagpattern, component/resource_type FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli'
--
INSERT INTO com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli (service/ranking, tagpattern, component/resource_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli'
--
UPDATE com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli SET service/ranking = ?, tagpattern = ?, component/resource_type = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli'
--
DELETE FROM com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_cli WHERE 1=2;

