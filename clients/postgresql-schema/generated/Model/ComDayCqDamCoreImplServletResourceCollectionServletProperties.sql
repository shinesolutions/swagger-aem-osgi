--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletResourceCollectionServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr'
--
SELECT sling/servlet/resource_types, sling/servlet/methods, sling/servlet/selectors, download/config, view/selector, send_email FROM com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr (sling/servlet/resource_types, sling/servlet/methods, sling/servlet/selectors, download/config, view/selector, send_email) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr'
--
UPDATE com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr SET sling/servlet/resource_types = ?, sling/servlet/methods = ?, sling/servlet/selectors = ?, download/config = ?, view/selector = ?, send_email = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_resource_collection_servlet_pr WHERE 1=2;

