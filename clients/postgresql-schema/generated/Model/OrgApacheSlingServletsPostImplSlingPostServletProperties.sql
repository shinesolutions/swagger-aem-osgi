--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplSlingPostServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_properti'
--
SELECT servlet/post/date_formats, servlet/post/node_name_hints, servlet/post/node_name_max_length, servlet/post/checkin_new_versionable_nodes, servlet/post/auto_checkout, servlet/post/auto_checkin, servlet/post/ignore_pattern FROM org_apache_sling_servlets_post_impl_sling_post_servlet_properti WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_properti'
--
INSERT INTO org_apache_sling_servlets_post_impl_sling_post_servlet_properti (servlet/post/date_formats, servlet/post/node_name_hints, servlet/post/node_name_max_length, servlet/post/checkin_new_versionable_nodes, servlet/post/auto_checkout, servlet/post/auto_checkin, servlet/post/ignore_pattern) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_properti'
--
UPDATE org_apache_sling_servlets_post_impl_sling_post_servlet_properti SET servlet/post/date_formats = ?, servlet/post/node_name_hints = ?, servlet/post/node_name_max_length = ?, servlet/post/checkin_new_versionable_nodes = ?, servlet/post/auto_checkout = ?, servlet/post/auto_checkin = ?, servlet/post/ignore_pattern = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_properti'
--
DELETE FROM org_apache_sling_servlets_post_impl_sling_post_servlet_properti WHERE 1=2;

