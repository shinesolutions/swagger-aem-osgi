--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_diff_diff_changes_obse'
--
SELECT enabled, agent_name, diff_path, observed_path, service_name, property_names, distribution_delay, service_user/target FROM com_adobe_granite_distribution_core_impl_diff_diff_changes_obse WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_diff_diff_changes_obse'
--
INSERT INTO com_adobe_granite_distribution_core_impl_diff_diff_changes_obse (enabled, agent_name, diff_path, observed_path, service_name, property_names, distribution_delay, service_user/target) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_diff_diff_changes_obse'
--
UPDATE com_adobe_granite_distribution_core_impl_diff_diff_changes_obse SET enabled = ?, agent_name = ?, diff_path = ?, observed_path = ?, service_name = ?, property_names = ?, distribution_delay = ?, service_user/target = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_diff_diff_changes_obse'
--
DELETE FROM com_adobe_granite_distribution_core_impl_diff_diff_changes_obse WHERE 1=2;

