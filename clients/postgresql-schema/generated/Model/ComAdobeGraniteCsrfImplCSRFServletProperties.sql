--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteCsrfImplCSRFServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_csrf_impl_csrf_servlet_properties'
--
SELECT csrf/token/expires/in, sling/auth/requirements FROM com_adobe_granite_csrf_impl_csrf_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_csrf_impl_csrf_servlet_properties'
--
INSERT INTO com_adobe_granite_csrf_impl_csrf_servlet_properties (csrf/token/expires/in, sling/auth/requirements) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_csrf_impl_csrf_servlet_properties'
--
UPDATE com_adobe_granite_csrf_impl_csrf_servlet_properties SET csrf/token/expires/in = ?, sling/auth/requirements = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_csrf_impl_csrf_servlet_properties'
--
DELETE FROM com_adobe_granite_csrf_impl_csrf_servlet_properties WHERE 1=2;

