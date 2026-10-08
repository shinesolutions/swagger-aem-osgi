--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingStartupfilterImplStartupFilterImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_startupfilter_impl_startup_filter_impl_propert'
--
SELECT active/by/default, default/message FROM org_apache_sling_startupfilter_impl_startup_filter_impl_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_startupfilter_impl_startup_filter_impl_propert'
--
INSERT INTO org_apache_sling_startupfilter_impl_startup_filter_impl_propert (active/by/default, default/message) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_startupfilter_impl_startup_filter_impl_propert'
--
UPDATE org_apache_sling_startupfilter_impl_startup_filter_impl_propert SET active/by/default = ?, default/message = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_startupfilter_impl_startup_filter_impl_propert'
--
DELETE FROM org_apache_sling_startupfilter_impl_startup_filter_impl_propert WHERE 1=2;

