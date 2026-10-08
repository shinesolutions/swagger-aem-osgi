--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_ WHERE 1=2;

