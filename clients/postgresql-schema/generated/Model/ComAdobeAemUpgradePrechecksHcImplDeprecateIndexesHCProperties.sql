--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr'
--
SELECT hc/name, hc/tags, hc/mbean/name FROM com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr'
--
INSERT INTO com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr (hc/name, hc/tags, hc/mbean/name) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr'
--
UPDATE com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr SET hc/name = ?, hc/tags = ?, hc/mbean/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr'
--
DELETE FROM com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_pr WHERE 1=2;

