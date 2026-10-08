--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMetadataGetServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie'
--
SELECT sling/servlet/resource_types, sling/servlet/methods, sling/servlet/extensions, sling/servlet/selectors FROM com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie (sling/servlet/resource_types, sling/servlet/methods, sling/servlet/extensions, sling/servlet/selectors) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie'
--
UPDATE com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie SET sling/servlet/resource_types = ?, sling/servlet/methods = ?, sling/servlet/extensions = ?, sling/servlet/selectors = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertie WHERE 1=2;

