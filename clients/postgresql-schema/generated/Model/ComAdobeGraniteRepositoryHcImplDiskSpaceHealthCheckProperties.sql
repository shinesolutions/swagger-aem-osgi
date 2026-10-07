--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_disk_space_health_check_pr'
--
SELECT hc/tags, disk/space/warn/threshold, disk/space/error/threshold FROM com_adobe_granite_repository_hc_impl_disk_space_health_check_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_disk_space_health_check_pr'
--
INSERT INTO com_adobe_granite_repository_hc_impl_disk_space_health_check_pr (hc/tags, disk/space/warn/threshold, disk/space/error/threshold) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_disk_space_health_check_pr'
--
UPDATE com_adobe_granite_repository_hc_impl_disk_space_health_check_pr SET hc/tags = ?, disk/space/warn/threshold = ?, disk/space/error/threshold = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_disk_space_health_check_pr'
--
DELETE FROM com_adobe_granite_repository_hc_impl_disk_space_health_check_pr WHERE 1=2;

