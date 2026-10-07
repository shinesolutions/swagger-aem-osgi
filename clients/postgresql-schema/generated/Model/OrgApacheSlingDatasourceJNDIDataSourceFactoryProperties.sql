--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDatasourceJNDIDataSourceFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_datasource_jndi_data_source_factory_properties'
--
SELECT datasource/name, datasource/svc/prop/name, datasource/jndi/name, jndi/properties FROM org_apache_sling_datasource_jndi_data_source_factory_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_datasource_jndi_data_source_factory_properties'
--
INSERT INTO org_apache_sling_datasource_jndi_data_source_factory_properties (datasource/name, datasource/svc/prop/name, datasource/jndi/name, jndi/properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_datasource_jndi_data_source_factory_properties'
--
UPDATE org_apache_sling_datasource_jndi_data_source_factory_properties SET datasource/name = ?, datasource/svc/prop/name = ?, datasource/jndi/name = ?, jndi/properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_datasource_jndi_data_source_factory_properties'
--
DELETE FROM org_apache_sling_datasource_jndi_data_source_factory_properties WHERE 1=2;

