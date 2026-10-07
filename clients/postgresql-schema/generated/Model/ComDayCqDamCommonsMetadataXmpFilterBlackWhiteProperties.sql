--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti'
--
SELECT xmp/filter/apply_whitelist, xmp/filter/whitelist, xmp/filter/apply_blacklist, xmp/filter/blacklist FROM com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti'
--
INSERT INTO com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti (xmp/filter/apply_whitelist, xmp/filter/whitelist, xmp/filter/apply_blacklist, xmp/filter/blacklist) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti'
--
UPDATE com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti SET xmp/filter/apply_whitelist = ?, xmp/filter/whitelist = ?, xmp/filter/apply_blacklist = ?, xmp/filter/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti'
--
DELETE FROM com_day_cq_dam_commons_metadata_xmp_filter_black_white_properti WHERE 1=2;

