--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_serviceusermapping_impl_service_user_mapper_im'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_serviceusermapping_impl_service_user_mapper_im WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_serviceusermapping_impl_service_user_mapper_im'
--
INSERT INTO org_apache_sling_serviceusermapping_impl_service_user_mapper_im (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_serviceusermapping_impl_service_user_mapper_im'
--
UPDATE org_apache_sling_serviceusermapping_impl_service_user_mapper_im SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_serviceusermapping_impl_service_user_mapper_im'
--
DELETE FROM org_apache_sling_serviceusermapping_impl_service_user_mapper_im WHERE 1=2;

