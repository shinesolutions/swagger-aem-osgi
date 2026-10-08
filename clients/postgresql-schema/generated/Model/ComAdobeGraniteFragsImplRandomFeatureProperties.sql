--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteFragsImplRandomFeatureProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_frags_impl_random_feature_properties'
--
SELECT feature/name, feature/description, active/percentage, cookie/name, cookie/max_age FROM com_adobe_granite_frags_impl_random_feature_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_frags_impl_random_feature_properties'
--
INSERT INTO com_adobe_granite_frags_impl_random_feature_properties (feature/name, feature/description, active/percentage, cookie/name, cookie/max_age) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_frags_impl_random_feature_properties'
--
UPDATE com_adobe_granite_frags_impl_random_feature_properties SET feature/name = ?, feature/description = ?, active/percentage = ?, cookie/name = ?, cookie/max_age = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_frags_impl_random_feature_properties'
--
DELETE FROM com_adobe_granite_frags_impl_random_feature_properties WHERE 1=2;

