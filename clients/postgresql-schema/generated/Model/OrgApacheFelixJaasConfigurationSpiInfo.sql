--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationSpiInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_jaas_configuration_spi_info'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_felix_jaas_configuration_spi_info WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_jaas_configuration_spi_info'
--
INSERT INTO org_apache_felix_jaas_configuration_spi_info (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_jaas_configuration_spi_info'
--
UPDATE org_apache_felix_jaas_configuration_spi_info SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_jaas_configuration_spi_info'
--
DELETE FROM org_apache_felix_jaas_configuration_spi_info WHERE 1=2;

