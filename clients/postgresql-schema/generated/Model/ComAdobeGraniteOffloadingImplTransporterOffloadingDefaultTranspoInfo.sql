--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_offloading_impl_transporter_offloading_defaul WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
INSERT INTO com_adobe_granite_offloading_impl_transporter_offloading_defaul (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
UPDATE com_adobe_granite_offloading_impl_transporter_offloading_defaul SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
DELETE FROM com_adobe_granite_offloading_impl_transporter_offloading_defaul WHERE 1=2;

