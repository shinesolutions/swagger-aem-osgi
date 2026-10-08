--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal'
--
SELECT hc/tags, dispatcher/address, dispatcher/filter/allowed, dispatcher/filter/blocked FROM com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal'
--
INSERT INTO com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal (hc/tags, dispatcher/address, dispatcher/filter/allowed, dispatcher/filter/blocked) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal'
--
UPDATE com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal SET hc/tags = ?, dispatcher/address = ?, dispatcher/filter/allowed = ?, dispatcher/filter/blocked = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal'
--
DELETE FROM com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_heal WHERE 1=2;

