--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteLicenseImplLicenseCheckFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_license_impl_license_check_filter_properties'
--
SELECT check_internval, exclude_ids, encrypt_ping FROM com_adobe_granite_license_impl_license_check_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_license_impl_license_check_filter_properties'
--
INSERT INTO com_adobe_granite_license_impl_license_check_filter_properties (check_internval, exclude_ids, encrypt_ping) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_license_impl_license_check_filter_properties'
--
UPDATE com_adobe_granite_license_impl_license_check_filter_properties SET check_internval = ?, exclude_ids = ?, encrypt_ping = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_license_impl_license_check_filter_properties'
--
DELETE FROM com_adobe_granite_license_impl_license_check_filter_properties WHERE 1=2;

