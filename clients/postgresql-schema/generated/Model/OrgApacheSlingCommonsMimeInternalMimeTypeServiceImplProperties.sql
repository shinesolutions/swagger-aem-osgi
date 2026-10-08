--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_mime_internal_mime_type_service_impl_p'
--
SELECT mime/types FROM org_apache_sling_commons_mime_internal_mime_type_service_impl_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_mime_internal_mime_type_service_impl_p'
--
INSERT INTO org_apache_sling_commons_mime_internal_mime_type_service_impl_p (mime/types) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_commons_mime_internal_mime_type_service_impl_p'
--
UPDATE org_apache_sling_commons_mime_internal_mime_type_service_impl_p SET mime/types = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_mime_internal_mime_type_service_impl_p'
--
DELETE FROM org_apache_sling_commons_mime_internal_mime_type_service_impl_p WHERE 1=2;

