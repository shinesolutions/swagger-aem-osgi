--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAuthImplCugCugSupportImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_auth_impl_cug_cug_support_impl_properties'
--
SELECT cug/exempted/principals, cug/enabled, cug/principals/regex, cug/principals/replacement FROM com_day_cq_auth_impl_cug_cug_support_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_auth_impl_cug_cug_support_impl_properties'
--
INSERT INTO com_day_cq_auth_impl_cug_cug_support_impl_properties (cug/exempted/principals, cug/enabled, cug/principals/regex, cug/principals/replacement) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_auth_impl_cug_cug_support_impl_properties'
--
UPDATE com_day_cq_auth_impl_cug_cug_support_impl_properties SET cug/exempted/principals = ?, cug/enabled = ?, cug/principals/regex = ?, cug/principals/replacement = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_auth_impl_cug_cug_support_impl_properties'
--
DELETE FROM com_day_cq_auth_impl_cug_cug_support_impl_properties WHERE 1=2;

