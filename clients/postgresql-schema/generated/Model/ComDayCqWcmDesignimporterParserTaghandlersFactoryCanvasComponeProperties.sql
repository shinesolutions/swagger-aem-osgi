--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas'
--
SELECT service/ranking, tagpattern FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas WHERE 1=2;

