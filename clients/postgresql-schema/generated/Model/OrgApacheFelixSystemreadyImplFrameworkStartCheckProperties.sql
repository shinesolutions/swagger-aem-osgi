--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplFrameworkStartCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_systemready_impl_framework_start_check_propert'
--
SELECT timeout, target/start/level, target/start/level/prop/name, "type" FROM org_apache_felix_systemready_impl_framework_start_check_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_systemready_impl_framework_start_check_propert'
--
INSERT INTO org_apache_felix_systemready_impl_framework_start_check_propert (timeout, target/start/level, target/start/level/prop/name, "type") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_systemready_impl_framework_start_check_propert'
--
UPDATE org_apache_felix_systemready_impl_framework_start_check_propert SET timeout = ?, target/start/level = ?, target/start/level/prop/name = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_systemready_impl_framework_start_check_propert'
--
DELETE FROM org_apache_felix_systemready_impl_framework_start_check_propert WHERE 1=2;

