--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i'
--
SELECT number_of_days, age_of_file FROM com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i'
--
INSERT INTO com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i (number_of_days, age_of_file) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i'
--
UPDATE com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i SET number_of_days = ?, age_of_file = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i'
--
DELETE FROM com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_i WHERE 1=2;

