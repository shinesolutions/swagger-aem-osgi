--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_replication_adapters_r'
--
SELECT provider_name, forward/requests FROM com_adobe_granite_distribution_core_impl_replication_adapters_r WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_replication_adapters_r'
--
INSERT INTO com_adobe_granite_distribution_core_impl_replication_adapters_r (provider_name, forward/requests) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_replication_adapters_r'
--
UPDATE com_adobe_granite_distribution_core_impl_replication_adapters_r SET provider_name = ?, forward/requests = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_replication_adapters_r'
--
DELETE FROM com_adobe_granite_distribution_core_impl_replication_adapters_r WHERE 1=2;

