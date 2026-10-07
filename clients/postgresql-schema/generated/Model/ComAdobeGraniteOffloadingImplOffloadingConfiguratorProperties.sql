--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_offloading_configurator_prope'
--
SELECT offloading/transporter, offloading/cleanup/payload FROM com_adobe_granite_offloading_impl_offloading_configurator_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_offloading_configurator_prope'
--
INSERT INTO com_adobe_granite_offloading_impl_offloading_configurator_prope (offloading/transporter, offloading/cleanup/payload) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_offloading_configurator_prope'
--
UPDATE com_adobe_granite_offloading_impl_offloading_configurator_prope SET offloading/transporter = ?, offloading/cleanup/payload = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_offloading_configurator_prope'
--
DELETE FROM com_adobe_granite_offloading_impl_offloading_configurator_prope WHERE 1=2;

