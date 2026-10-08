--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDeserfwImplDeserializationFirewallImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert'
--
SELECT firewall/deserialization/whitelist, firewall/deserialization/blacklist, firewall/deserialization/diagnostics FROM com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert'
--
INSERT INTO com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert (firewall/deserialization/whitelist, firewall/deserialization/blacklist, firewall/deserialization/diagnostics) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert'
--
UPDATE com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert SET firewall/deserialization/whitelist = ?, firewall/deserialization/blacklist = ?, firewall/deserialization/diagnostics = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert'
--
DELETE FROM com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propert WHERE 1=2;

