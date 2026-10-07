--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialGroupImplGroupServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_group_impl_group_service_impl_properties'
--
SELECT max_wait_time, min_wait_between_retries FROM com_adobe_cq_social_group_impl_group_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_group_impl_group_service_impl_properties'
--
INSERT INTO com_adobe_cq_social_group_impl_group_service_impl_properties (max_wait_time, min_wait_between_retries) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_group_impl_group_service_impl_properties'
--
UPDATE com_adobe_cq_social_group_impl_group_service_impl_properties SET max_wait_time = ?, min_wait_between_retries = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_group_impl_group_service_impl_properties'
--
DELETE FROM com_adobe_cq_social_group_impl_group_service_impl_properties WHERE 1=2;

