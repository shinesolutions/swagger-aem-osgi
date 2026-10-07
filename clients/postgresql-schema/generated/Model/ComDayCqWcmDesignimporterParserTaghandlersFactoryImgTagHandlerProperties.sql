--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta'
--
SELECT service/ranking, tagpattern FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta'
--
INSERT INTO com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta (service/ranking, tagpattern) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta'
--
UPDATE com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta SET service/ranking = ?, tagpattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta'
--
DELETE FROM com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_ta WHERE 1=2;

