--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces'
--
SELECT forms/formparagraphpostprocessor/enabled, forms/formparagraphpostprocessor/formresourcetypes FROM com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces'
--
INSERT INTO com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces (forms/formparagraphpostprocessor/enabled, forms/formparagraphpostprocessor/formresourcetypes) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces'
--
UPDATE com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces SET forms/formparagraphpostprocessor/enabled = ?, forms/formparagraphpostprocessor/formresourcetypes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces'
--
DELETE FROM com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_proces WHERE 1=2;

