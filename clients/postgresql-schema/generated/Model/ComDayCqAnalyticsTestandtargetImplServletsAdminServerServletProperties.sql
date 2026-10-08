--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s'
--
SELECT testandtarget/endpoint/url FROM com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s (testandtarget/endpoint/url) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s'
--
UPDATE com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s SET testandtarget/endpoint/url = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_servlets_admin_server_s WHERE 1=2;

