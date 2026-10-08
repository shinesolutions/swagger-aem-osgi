--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
SELECT pid, title, description, properties FROM com_adobe_granite_repository_hc_impl_content_sling_sling_conten WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
INSERT INTO com_adobe_granite_repository_hc_impl_content_sling_sling_conten (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
UPDATE com_adobe_granite_repository_hc_impl_content_sling_sling_conten SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
DELETE FROM com_adobe_granite_repository_hc_impl_content_sling_sling_conten WHERE 1=2;

