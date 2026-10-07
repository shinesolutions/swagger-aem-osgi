--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterProcessorImplHtmlParserFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_processor_impl_html_parser_factory_properti'
--
SELECT htmlparser/process_tags, htmlparser/preserve_camel_case FROM com_day_cq_rewriter_processor_impl_html_parser_factory_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_processor_impl_html_parser_factory_properti'
--
INSERT INTO com_day_cq_rewriter_processor_impl_html_parser_factory_properti (htmlparser/process_tags, htmlparser/preserve_camel_case) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_processor_impl_html_parser_factory_properti'
--
UPDATE com_day_cq_rewriter_processor_impl_html_parser_factory_properti SET htmlparser/process_tags = ?, htmlparser/preserve_camel_case = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_processor_impl_html_parser_factory_properti'
--
DELETE FROM com_day_cq_rewriter_processor_impl_html_parser_factory_properti WHERE 1=2;

