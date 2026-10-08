--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqHcContentPackagesHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_hc_content_packages_health_check_properties'
--
SELECT hc/name, hc/tags, hc/mbean/name, package/names FROM com_adobe_cq_hc_content_packages_health_check_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_hc_content_packages_health_check_properties'
--
INSERT INTO com_adobe_cq_hc_content_packages_health_check_properties (hc/name, hc/tags, hc/mbean/name, package/names) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_hc_content_packages_health_check_properties'
--
UPDATE com_adobe_cq_hc_content_packages_health_check_properties SET hc/name = ?, hc/tags = ?, hc/mbean/name = ?, package/names = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_hc_content_packages_health_check_properties'
--
DELETE FROM com_adobe_cq_hc_content_packages_health_check_properties WHERE 1=2;

