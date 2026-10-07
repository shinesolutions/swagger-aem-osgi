--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationSpiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_jaas_configuration_spi_properties'
--
SELECT jaas/default_realm_name, jaas/config_provider_name, jaas/global_config_policy FROM org_apache_felix_jaas_configuration_spi_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_jaas_configuration_spi_properties'
--
INSERT INTO org_apache_felix_jaas_configuration_spi_properties (jaas/default_realm_name, jaas/config_provider_name, jaas/global_config_policy) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_jaas_configuration_spi_properties'
--
UPDATE org_apache_felix_jaas_configuration_spi_properties SET jaas/default_realm_name = ?, jaas/config_provider_name = ?, jaas/global_config_policy = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_jaas_configuration_spi_properties'
--
DELETE FROM org_apache_felix_jaas_configuration_spi_properties WHERE 1=2;

