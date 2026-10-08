--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle'
--
SELECT cq/dam/drm/enable FROM com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle (cq/dam/drm/enable) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle'
--
UPDATE com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle SET cq/dam/drm/enable = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_multiple_license_accept_servle WHERE 1=2;

