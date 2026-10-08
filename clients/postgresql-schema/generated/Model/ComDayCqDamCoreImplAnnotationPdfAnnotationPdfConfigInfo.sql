--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i'
--
INSERT INTO com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i'
--
UPDATE com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i'
--
DELETE FROM com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_i WHERE 1=2;

