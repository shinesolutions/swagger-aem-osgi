--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplLightboxLightboxServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties'
--
SELECT sling/servlet/paths, sling/servlet/methods, cq/dam/enable/anonymous FROM com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties'
--
INSERT INTO com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties (sling/servlet/paths, sling/servlet/methods, cq/dam/enable/anonymous) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties'
--
UPDATE com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties SET sling/servlet/paths = ?, sling/servlet/methods = ?, cq/dam/enable/anonymous = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties'
--
DELETE FROM com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties WHERE 1=2;

