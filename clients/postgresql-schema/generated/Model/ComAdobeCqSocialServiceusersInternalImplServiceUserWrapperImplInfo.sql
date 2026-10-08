--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_serviceusers_internal_impl_service_user_wra'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_serviceusers_internal_impl_service_user_wra WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_serviceusers_internal_impl_service_user_wra'
--
INSERT INTO com_adobe_cq_social_serviceusers_internal_impl_service_user_wra (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_serviceusers_internal_impl_service_user_wra'
--
UPDATE com_adobe_cq_social_serviceusers_internal_impl_service_user_wra SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_serviceusers_internal_impl_service_user_wra'
--
DELETE FROM com_adobe_cq_social_serviceusers_internal_impl_service_user_wra WHERE 1=2;

