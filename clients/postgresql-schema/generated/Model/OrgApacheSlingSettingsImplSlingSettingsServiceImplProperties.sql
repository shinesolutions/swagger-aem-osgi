--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingSettingsImplSlingSettingsServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_settings_impl_sling_settings_service_impl_prop'
--
SELECT sling/name, sling/description FROM org_apache_sling_settings_impl_sling_settings_service_impl_prop WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_settings_impl_sling_settings_service_impl_prop'
--
INSERT INTO org_apache_sling_settings_impl_sling_settings_service_impl_prop (sling/name, sling/description) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_settings_impl_sling_settings_service_impl_prop'
--
UPDATE org_apache_sling_settings_impl_sling_settings_service_impl_prop SET sling/name = ?, sling/description = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_settings_impl_sling_settings_service_impl_prop'
--
DELETE FROM org_apache_sling_settings_impl_sling_settings_service_impl_prop WHERE 1=2;

