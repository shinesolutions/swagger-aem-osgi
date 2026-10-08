--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormsHandlingServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro'
--
SELECT name/whitelist, allow/expressions FROM com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro'
--
INSERT INTO com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro (name/whitelist, allow/expressions) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro'
--
UPDATE com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro SET name/whitelist = ?, allow/expressions = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro'
--
DELETE FROM com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_pro WHERE 1=2;

