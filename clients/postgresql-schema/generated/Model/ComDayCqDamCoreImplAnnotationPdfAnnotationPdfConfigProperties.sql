--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p'
--
SELECT cq/dam/config/annotation/pdf/document/width, cq/dam/config/annotation/pdf/document/height, cq/dam/config/annotation/pdf/document/padding/horizontal, cq/dam/config/annotation/pdf/document/padding/vertical, cq/dam/config/annotation/pdf/font/size, cq/dam/config/annotation/pdf/font/color, cq/dam/config/annotation/pdf/font/family, cq/dam/config/annotation/pdf/font/light, cq/dam/config/annotation/pdf/margin_text_image, cq/dam/config/annotation/pdf/min_image_height, cq/dam/config/annotation/pdf/review_status/width, cq/dam/config/annotation/pdf/review_status/color/approved, cq/dam/config/annotation/pdf/review_status/color/rejected, cq/dam/config/annotation/pdf/review_status/color/changes_reques, cq/dam/config/annotation/pdf/annotation_marker/width, cq/dam/config/annotation/pdf/asset/minheight FROM com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p'
--
INSERT INTO com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p (cq/dam/config/annotation/pdf/document/width, cq/dam/config/annotation/pdf/document/height, cq/dam/config/annotation/pdf/document/padding/horizontal, cq/dam/config/annotation/pdf/document/padding/vertical, cq/dam/config/annotation/pdf/font/size, cq/dam/config/annotation/pdf/font/color, cq/dam/config/annotation/pdf/font/family, cq/dam/config/annotation/pdf/font/light, cq/dam/config/annotation/pdf/margin_text_image, cq/dam/config/annotation/pdf/min_image_height, cq/dam/config/annotation/pdf/review_status/width, cq/dam/config/annotation/pdf/review_status/color/approved, cq/dam/config/annotation/pdf/review_status/color/rejected, cq/dam/config/annotation/pdf/review_status/color/changes_reques, cq/dam/config/annotation/pdf/annotation_marker/width, cq/dam/config/annotation/pdf/asset/minheight) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p'
--
UPDATE com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p SET cq/dam/config/annotation/pdf/document/width = ?, cq/dam/config/annotation/pdf/document/height = ?, cq/dam/config/annotation/pdf/document/padding/horizontal = ?, cq/dam/config/annotation/pdf/document/padding/vertical = ?, cq/dam/config/annotation/pdf/font/size = ?, cq/dam/config/annotation/pdf/font/color = ?, cq/dam/config/annotation/pdf/font/family = ?, cq/dam/config/annotation/pdf/font/light = ?, cq/dam/config/annotation/pdf/margin_text_image = ?, cq/dam/config/annotation/pdf/min_image_height = ?, cq/dam/config/annotation/pdf/review_status/width = ?, cq/dam/config/annotation/pdf/review_status/color/approved = ?, cq/dam/config/annotation/pdf/review_status/color/rejected = ?, cq/dam/config/annotation/pdf/review_status/color/changes_reques = ?, cq/dam/config/annotation/pdf/annotation_marker/width = ?, cq/dam/config/annotation/pdf/asset/minheight = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p'
--
DELETE FROM com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_p WHERE 1=2;

