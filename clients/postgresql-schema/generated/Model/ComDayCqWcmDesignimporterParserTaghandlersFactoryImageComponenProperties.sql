--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_'
--
SELECT service/ranking, tagpattern, component/resource_type FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_ (service/ranking, tagpattern, component/resource_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_ SET service/ranking = ?, tagpattern = ?, component/resource_type = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_ WHERE 1=2;

