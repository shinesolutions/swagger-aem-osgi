--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_jaas_configuration_factory_properties'
--
SELECT jaas/control_flag, jaas/ranking, jaas/realm_name, jaas/classname, jaas/options FROM org_apache_felix_jaas_configuration_factory_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_jaas_configuration_factory_properties'
--
INSERT INTO org_apache_felix_jaas_configuration_factory_properties (jaas/control_flag, jaas/ranking, jaas/realm_name, jaas/classname, jaas/options) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_jaas_configuration_factory_properties'
--
UPDATE org_apache_felix_jaas_configuration_factory_properties SET jaas/control_flag = ?, jaas/ranking = ?, jaas/realm_name = ?, jaas/classname = ?, jaas/options = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_jaas_configuration_factory_properties'
--
DELETE FROM org_apache_felix_jaas_configuration_factory_properties WHERE 1=2;

