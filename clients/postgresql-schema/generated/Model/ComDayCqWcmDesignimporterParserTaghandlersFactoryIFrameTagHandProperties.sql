--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram'
--
SELECT service/ranking, tagpattern FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_fram WHERE 1=2;

