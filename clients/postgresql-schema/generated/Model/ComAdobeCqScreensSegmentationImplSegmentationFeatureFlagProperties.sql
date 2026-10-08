--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla'
--
SELECT enable_data_triggered_content FROM com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla'
--
INSERT INTO com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla (enable_data_triggered_content) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla'
--
UPDATE com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla SET enable_data_triggered_content = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla'
--
DELETE FROM com_adobe_cq_screens_segmentation_impl_segmentation_feature_fla WHERE 1=2;

