--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'apacheSlingHealthCheckResultHTMLSerializerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'apache_sling_health_check_result_html_serializer_info'
--
SELECT pid, title, description, properties FROM apache_sling_health_check_result_html_serializer_info WHERE 1=1;

--
-- INSERT template for table 'apache_sling_health_check_result_html_serializer_info'
--
INSERT INTO apache_sling_health_check_result_html_serializer_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'apache_sling_health_check_result_html_serializer_info'
--
UPDATE apache_sling_health_check_result_html_serializer_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'apache_sling_health_check_result_html_serializer_info'
--
DELETE FROM apache_sling_health_check_result_html_serializer_info WHERE 1=2;

