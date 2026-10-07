--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties'
--
SELECT legacy_cloud_ugc_path_mapping FROM com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties'
--
INSERT INTO com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties (legacy_cloud_ugc_path_mapping) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties'
--
UPDATE com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties SET legacy_cloud_ugc_path_mapping = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties'
--
DELETE FROM com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties WHERE 1=2;

