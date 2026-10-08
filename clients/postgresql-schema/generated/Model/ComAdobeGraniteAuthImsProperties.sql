--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthImsProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_ims_properties'
--
SELECT configid, "scope" FROM com_adobe_granite_auth_ims_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_ims_properties'
--
INSERT INTO com_adobe_granite_auth_ims_properties (configid, "scope") VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_ims_properties'
--
UPDATE com_adobe_granite_auth_ims_properties SET configid = ?, "scope" = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_ims_properties'
--
DELETE FROM com_adobe_granite_auth_ims_properties WHERE 1=2;

