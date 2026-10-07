--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_agent_'
--
SELECT offloading/agentmanager/enabled FROM com_adobe_granite_offloading_impl_transporter_offloading_agent_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_transporter_offloading_agent_'
--
INSERT INTO com_adobe_granite_offloading_impl_transporter_offloading_agent_ (offloading/agentmanager/enabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_agent_'
--
UPDATE com_adobe_granite_offloading_impl_transporter_offloading_agent_ SET offloading/agentmanager/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_transporter_offloading_agent_'
--
DELETE FROM com_adobe_granite_offloading_impl_transporter_offloading_agent_ WHERE 1=2;

