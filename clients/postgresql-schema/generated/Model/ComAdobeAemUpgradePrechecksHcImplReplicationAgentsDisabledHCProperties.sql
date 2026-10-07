--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa'
--
SELECT hc/name, hc/tags, hc/mbean/name FROM com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa'
--
INSERT INTO com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa (hc/name, hc/tags, hc/mbean/name) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa'
--
UPDATE com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa SET hc/name = ?, hc/tags = ?, hc/mbean/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa'
--
DELETE FROM com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disa WHERE 1=2;

