--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_frags_impl_check_http_header_flag_properties'
--
SELECT feature/name, feature/description, http/header/name, http/header/valuepattern FROM com_adobe_granite_frags_impl_check_http_header_flag_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_frags_impl_check_http_header_flag_properties'
--
INSERT INTO com_adobe_granite_frags_impl_check_http_header_flag_properties (feature/name, feature/description, http/header/name, http/header/valuepattern) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_frags_impl_check_http_header_flag_properties'
--
UPDATE com_adobe_granite_frags_impl_check_http_header_flag_properties SET feature/name = ?, feature/description = ?, http/header/name = ?, http/header/valuepattern = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_frags_impl_check_http_header_flag_properties'
--
DELETE FROM com_adobe_granite_frags_impl_check_http_header_flag_properties WHERE 1=2;

