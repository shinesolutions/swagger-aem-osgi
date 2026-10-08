--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteCsrfImplCSRFFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_csrf_impl_csrf_filter_properties'
--
SELECT filter/methods, filter/enable/safe/user/agents, filter/safe/user/agents, filter/excluded/paths FROM com_adobe_granite_csrf_impl_csrf_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_csrf_impl_csrf_filter_properties'
--
INSERT INTO com_adobe_granite_csrf_impl_csrf_filter_properties (filter/methods, filter/enable/safe/user/agents, filter/safe/user/agents, filter/excluded/paths) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_csrf_impl_csrf_filter_properties'
--
UPDATE com_adobe_granite_csrf_impl_csrf_filter_properties SET filter/methods = ?, filter/enable/safe/user/agents = ?, filter/safe/user/agents = ?, filter/excluded/paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_csrf_impl_csrf_filter_properties'
--
DELETE FROM com_adobe_granite_csrf_impl_csrf_filter_properties WHERE 1=2;

