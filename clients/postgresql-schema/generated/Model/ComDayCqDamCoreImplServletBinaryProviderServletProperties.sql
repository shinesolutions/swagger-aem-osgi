--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletBinaryProviderServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper'
--
SELECT sling/servlet/resource_types, sling/servlet/methods, cq/dam/drm/enable FROM com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper (sling/servlet/resource_types, sling/servlet/methods, cq/dam/drm/enable) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper'
--
UPDATE com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper SET sling/servlet/resource_types = ?, sling/servlet/methods = ?, cq/dam/drm/enable = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_binary_provider_servlet_proper WHERE 1=2;

