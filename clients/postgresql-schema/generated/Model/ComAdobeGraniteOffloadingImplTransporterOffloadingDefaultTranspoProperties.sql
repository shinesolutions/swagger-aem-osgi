--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
SELECT default/transport/agent_to_worker/prefix, default/transport/agent_to_master/prefix, default/transport/input/package, default/transport/output/package, default/transport/replication/synchronous, default/transport/contentpackage, offloading/transporter/default/enabled FROM com_adobe_granite_offloading_impl_transporter_offloading_defaul WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
INSERT INTO com_adobe_granite_offloading_impl_transporter_offloading_defaul (default/transport/agent_to_worker/prefix, default/transport/agent_to_master/prefix, default/transport/input/package, default/transport/output/package, default/transport/replication/synchronous, default/transport/contentpackage, offloading/transporter/default/enabled) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
UPDATE com_adobe_granite_offloading_impl_transporter_offloading_defaul SET default/transport/agent_to_worker/prefix = ?, default/transport/agent_to_master/prefix = ?, default/transport/input/package = ?, default/transport/output/package = ?, default/transport/replication/synchronous = ?, default/transport/contentpackage = ?, offloading/transporter/default/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_defaul'
--
DELETE FROM com_adobe_granite_offloading_impl_transporter_offloading_defaul WHERE 1=2;

