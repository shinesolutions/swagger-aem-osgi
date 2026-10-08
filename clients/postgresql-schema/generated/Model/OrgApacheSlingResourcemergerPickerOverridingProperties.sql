--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingResourcemergerPickerOverridingProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_resourcemerger_picker_overriding_properties'
--
SELECT merge/root, merge/read_only FROM org_apache_sling_resourcemerger_picker_overriding_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_resourcemerger_picker_overriding_properties'
--
INSERT INTO org_apache_sling_resourcemerger_picker_overriding_properties (merge/root, merge/read_only) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_resourcemerger_picker_overriding_properties'
--
UPDATE org_apache_sling_resourcemerger_picker_overriding_properties SET merge/root = ?, merge/read_only = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_resourcemerger_picker_overriding_properties'
--
DELETE FROM org_apache_sling_resourcemerger_picker_overriding_properties WHERE 1=2;

