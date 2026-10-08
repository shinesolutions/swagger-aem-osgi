--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_resource_inventory_impl_resource_inventory_pri'
--
SELECT felix/inventory/printer/name, felix/inventory/printer/title, "path" FROM org_apache_sling_resource_inventory_impl_resource_inventory_pri WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_resource_inventory_impl_resource_inventory_pri'
--
INSERT INTO org_apache_sling_resource_inventory_impl_resource_inventory_pri (felix/inventory/printer/name, felix/inventory/printer/title, "path") VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_resource_inventory_impl_resource_inventory_pri'
--
UPDATE org_apache_sling_resource_inventory_impl_resource_inventory_pri SET felix/inventory/printer/name = ?, felix/inventory/printer/title = ?, "path" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_resource_inventory_impl_resource_inventory_pri'
--
DELETE FROM org_apache_sling_resource_inventory_impl_resource_inventory_pri WHERE 1=2;

