--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingResourcemergerPickerOverridingInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_resourcemerger_picker_overriding_info'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM org_apache_sling_resourcemerger_picker_overriding_info WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_resourcemerger_picker_overriding_info'
--
INSERT INTO org_apache_sling_resourcemerger_picker_overriding_info (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_resourcemerger_picker_overriding_info'
--
UPDATE org_apache_sling_resourcemerger_picker_overriding_info SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_resourcemerger_picker_overriding_info'
--
DELETE FROM org_apache_sling_resourcemerger_picker_overriding_info WHERE 1=2;

