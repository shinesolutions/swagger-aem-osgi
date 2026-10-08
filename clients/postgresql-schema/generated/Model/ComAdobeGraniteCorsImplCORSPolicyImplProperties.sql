--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteCorsImplCORSPolicyImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_cors_impl_cors_policy_impl_properties'
--
SELECT alloworigin, alloworiginregexp, allowedpaths, exposedheaders, maxage, supportedheaders, supportedmethods, supportscredentials FROM com_adobe_granite_cors_impl_cors_policy_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_cors_impl_cors_policy_impl_properties'
--
INSERT INTO com_adobe_granite_cors_impl_cors_policy_impl_properties (alloworigin, alloworiginregexp, allowedpaths, exposedheaders, maxage, supportedheaders, supportedmethods, supportscredentials) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_cors_impl_cors_policy_impl_properties'
--
UPDATE com_adobe_granite_cors_impl_cors_policy_impl_properties SET alloworigin = ?, alloworiginregexp = ?, allowedpaths = ?, exposedheaders = ?, maxage = ?, supportedheaders = ?, supportedmethods = ?, supportscredentials = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_cors_impl_cors_policy_impl_properties'
--
DELETE FROM com_adobe_granite_cors_impl_cors_policy_impl_properties WHERE 1=2;

