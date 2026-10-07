--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_script'
--
SELECT service/ranking, tagpattern FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_script WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_script'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_script (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_script'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_script SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_script'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_script WHERE 1=2;

