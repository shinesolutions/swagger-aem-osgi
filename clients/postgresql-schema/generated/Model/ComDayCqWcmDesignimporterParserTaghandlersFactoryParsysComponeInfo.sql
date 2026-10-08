--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys WHERE 1=2;

