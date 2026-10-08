--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingSecurityImplContentDispositionFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_security_impl_content_disposition_filter_prope'
--
SELECT sling/content/disposition/paths, sling/content/disposition/excluded/paths, sling/content/disposition/all/paths FROM org_apache_sling_security_impl_content_disposition_filter_prope WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_security_impl_content_disposition_filter_prope'
--
INSERT INTO org_apache_sling_security_impl_content_disposition_filter_prope (sling/content/disposition/paths, sling/content/disposition/excluded/paths, sling/content/disposition/all/paths) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_security_impl_content_disposition_filter_prope'
--
UPDATE org_apache_sling_security_impl_content_disposition_filter_prope SET sling/content/disposition/paths = ?, sling/content/disposition/excluded/paths = ?, sling/content/disposition/all/paths = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_security_impl_content_disposition_filter_prope'
--
DELETE FROM org_apache_sling_security_impl_content_disposition_filter_prope WHERE 1=2;

