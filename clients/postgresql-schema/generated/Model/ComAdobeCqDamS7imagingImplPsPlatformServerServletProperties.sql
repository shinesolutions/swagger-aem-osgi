--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamS7imagingImplPsPlatformServerServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop'
--
SELECT cache/enable, cache/root_paths, cache/max_size, cache/max_entries FROM com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop'
--
INSERT INTO com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop (cache/enable, cache/root_paths, cache/max_size, cache/max_entries) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop'
--
UPDATE com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop SET cache/enable = ?, cache/root_paths = ?, cache/max_size = ?, cache/max_entries = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop'
--
DELETE FROM com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_prop WHERE 1=2;

