--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServicesCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_systemready_impl_services_check_properties'
--
SELECT services/list, "type" FROM org_apache_felix_systemready_impl_services_check_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_systemready_impl_services_check_properties'
--
INSERT INTO org_apache_felix_systemready_impl_services_check_properties (services/list, "type") VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_felix_systemready_impl_services_check_properties'
--
UPDATE org_apache_felix_systemready_impl_services_check_properties SET services/list = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_systemready_impl_services_check_properties'
--
DELETE FROM org_apache_felix_systemready_impl_services_check_properties WHERE 1=2;

