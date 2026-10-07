--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec'
--
SELECT pid, title, description, properties FROM com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec'
--
UPDATE com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_chec WHERE 1=2;

