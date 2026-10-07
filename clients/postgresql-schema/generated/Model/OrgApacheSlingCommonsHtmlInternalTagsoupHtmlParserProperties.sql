--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_html_internal_tagsoup_html_parser_prop'
--
SELECT parser/features FROM org_apache_sling_commons_html_internal_tagsoup_html_parser_prop WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_html_internal_tagsoup_html_parser_prop'
--
INSERT INTO org_apache_sling_commons_html_internal_tagsoup_html_parser_prop (parser/features) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_commons_html_internal_tagsoup_html_parser_prop'
--
UPDATE org_apache_sling_commons_html_internal_tagsoup_html_parser_prop SET parser/features = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_html_internal_tagsoup_html_parser_prop'
--
DELETE FROM org_apache_sling_commons_html_internal_tagsoup_html_parser_prop WHERE 1=2;

