--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_replication_distributi'
--
SELECT pid, title, description, properties FROM com_adobe_granite_distribution_core_impl_replication_distributi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_replication_distributi'
--
INSERT INTO com_adobe_granite_distribution_core_impl_replication_distributi (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_replication_distributi'
--
UPDATE com_adobe_granite_distribution_core_impl_replication_distributi SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_replication_distributi'
--
DELETE FROM com_adobe_granite_distribution_core_impl_replication_distributi WHERE 1=2;

