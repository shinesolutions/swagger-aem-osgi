--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormChooserServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope'
--
SELECT service/name, sling/servlet/resource_types, sling/servlet/selectors, sling/servlet/methods, forms/formchooserservlet/advansesearch/require FROM com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope'
--
INSERT INTO com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope (service/name, sling/servlet/resource_types, sling/servlet/selectors, sling/servlet/methods, forms/formchooserservlet/advansesearch/require) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope'
--
UPDATE com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope SET service/name = ?, sling/servlet/resource_types = ?, sling/servlet/selectors = ?, sling/servlet/methods = ?, forms/formchooserservlet/advansesearch/require = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope'
--
DELETE FROM com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_prope WHERE 1=2;

