--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev'
--
SELECT pid, title, description, properties FROM com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev'
--
INSERT INTO com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev'
--
UPDATE com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev'
--
DELETE FROM com_adobe_cq_cloudconfig_core_impl_configuration_replication_ev WHERE 1=2;

