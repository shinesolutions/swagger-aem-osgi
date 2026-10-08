--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqAddressImplLocationLocationListServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_address_impl_location_location_list_servlet_proper'
--
SELECT cq/address/location/default/max_results FROM com_adobe_cq_address_impl_location_location_list_servlet_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_address_impl_location_location_list_servlet_proper'
--
INSERT INTO com_adobe_cq_address_impl_location_location_list_servlet_proper (cq/address/location/default/max_results) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_address_impl_location_location_list_servlet_proper'
--
UPDATE com_adobe_cq_address_impl_location_location_list_servlet_proper SET cq/address/location/default/max_results = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_address_impl_location_location_list_servlet_proper'
--
DELETE FROM com_adobe_cq_address_impl_location_location_list_servlet_proper WHERE 1=2;

