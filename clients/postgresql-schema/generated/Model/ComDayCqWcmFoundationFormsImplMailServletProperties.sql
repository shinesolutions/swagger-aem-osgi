--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplMailServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties'
--
SELECT sling/servlet/resource_types, sling/servlet/selectors, resource/whitelist, resource/blacklist FROM com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties'
--
INSERT INTO com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties (sling/servlet/resource_types, sling/servlet/selectors, resource/whitelist, resource/blacklist) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties'
--
UPDATE com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties SET sling/servlet/resource_types = ?, sling/servlet/selectors = ?, resource/whitelist = ?, resource/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties'
--
DELETE FROM com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties WHERE 1=2;

