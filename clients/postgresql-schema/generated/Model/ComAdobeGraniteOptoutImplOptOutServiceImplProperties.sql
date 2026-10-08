--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOptoutImplOptOutServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_optout_impl_opt_out_service_impl_properties'
--
SELECT optout/cookies, optout/headers, optout/whitelist/cookies FROM com_adobe_granite_optout_impl_opt_out_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_optout_impl_opt_out_service_impl_properties'
--
INSERT INTO com_adobe_granite_optout_impl_opt_out_service_impl_properties (optout/cookies, optout/headers, optout/whitelist/cookies) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_optout_impl_opt_out_service_impl_properties'
--
UPDATE com_adobe_granite_optout_impl_opt_out_service_impl_properties SET optout/cookies = ?, optout/headers = ?, optout/whitelist/cookies = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_optout_impl_opt_out_service_impl_properties'
--
DELETE FROM com_adobe_granite_optout_impl_opt_out_service_impl_properties WHERE 1=2;

