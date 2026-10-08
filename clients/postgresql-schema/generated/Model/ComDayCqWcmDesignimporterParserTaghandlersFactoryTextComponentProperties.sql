--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c'
--
SELECT service/ranking, tagpattern, component/resource_type FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c (service/ranking, tagpattern, component/resource_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c SET service/ranking = ?, tagpattern = ?, component/resource_type = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_c WHERE 1=2;

