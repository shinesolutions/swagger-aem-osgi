--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t'
--
SELECT service/ranking, tagpattern FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_t WHERE 1=2;

