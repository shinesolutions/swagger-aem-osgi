--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_distribution_to_replic'
--
SELECT pid, title, description, properties FROM com_adobe_granite_distribution_core_impl_distribution_to_replic WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_distribution_to_replic'
--
INSERT INTO com_adobe_granite_distribution_core_impl_distribution_to_replic (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_distribution_to_replic'
--
UPDATE com_adobe_granite_distribution_core_impl_distribution_to_replic SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_distribution_to_replic'
--
DELETE FROM com_adobe_granite_distribution_core_impl_distribution_to_replic WHERE 1=2;

