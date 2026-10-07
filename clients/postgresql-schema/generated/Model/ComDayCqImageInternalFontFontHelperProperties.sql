--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqImageInternalFontFontHelperProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_image_internal_font_font_helper_properties'
--
SELECT fontpath, oversampling_factor FROM com_day_cq_image_internal_font_font_helper_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_image_internal_font_font_helper_properties'
--
INSERT INTO com_day_cq_image_internal_font_font_helper_properties (fontpath, oversampling_factor) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_image_internal_font_font_helper_properties'
--
UPDATE com_day_cq_image_internal_font_font_helper_properties SET fontpath = ?, oversampling_factor = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_image_internal_font_font_helper_properties'
--
DELETE FROM com_day_cq_image_internal_font_font_helper_properties WHERE 1=2;

