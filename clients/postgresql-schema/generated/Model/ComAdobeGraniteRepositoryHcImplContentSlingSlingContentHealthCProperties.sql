--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
SELECT hc/tags, exclude/search/path FROM com_adobe_granite_repository_hc_impl_content_sling_sling_conten WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
INSERT INTO com_adobe_granite_repository_hc_impl_content_sling_sling_conten (hc/tags, exclude/search/path) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
UPDATE com_adobe_granite_repository_hc_impl_content_sling_sling_conten SET hc/tags = ?, exclude/search/path = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_content_sling_sling_conten'
--
DELETE FROM com_adobe_granite_repository_hc_impl_content_sling_sling_conten WHERE 1=2;

