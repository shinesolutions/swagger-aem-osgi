--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_info'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_commons_metadata_xmp_filter_black_white_info WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_info'
--
INSERT INTO com_day_cq_dam_commons_metadata_xmp_filter_black_white_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_info'
--
UPDATE com_day_cq_dam_commons_metadata_xmp_filter_black_white_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_info'
--
DELETE FROM com_day_cq_dam_commons_metadata_xmp_filter_black_white_info WHERE 1=2;

