--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_transport_access_token'
--
SELECT "name", service_name, user_id, access_token_provider/target FROM com_adobe_granite_distribution_core_impl_transport_access_token WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_transport_access_token'
--
INSERT INTO com_adobe_granite_distribution_core_impl_transport_access_token ("name", service_name, user_id, access_token_provider/target) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_transport_access_token'
--
UPDATE com_adobe_granite_distribution_core_impl_transport_access_token SET "name" = ?, service_name = ?, user_id = ?, access_token_provider/target = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_transport_access_token'
--
DELETE FROM com_adobe_granite_distribution_core_impl_transport_access_token WHERE 1=2;

