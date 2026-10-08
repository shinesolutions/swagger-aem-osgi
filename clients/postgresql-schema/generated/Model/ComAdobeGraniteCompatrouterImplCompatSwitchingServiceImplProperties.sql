--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_compatrouter_impl_compat_switching_service_im'
--
SELECT compatgroups, enabled FROM com_adobe_granite_compatrouter_impl_compat_switching_service_im WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_compatrouter_impl_compat_switching_service_im'
--
INSERT INTO com_adobe_granite_compatrouter_impl_compat_switching_service_im (compatgroups, enabled) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_compatrouter_impl_compat_switching_service_im'
--
UPDATE com_adobe_granite_compatrouter_impl_compat_switching_service_im SET compatgroups = ?, enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_compatrouter_impl_compat_switching_service_im'
--
DELETE FROM com_adobe_granite_compatrouter_impl_compat_switching_service_im WHERE 1=2;

