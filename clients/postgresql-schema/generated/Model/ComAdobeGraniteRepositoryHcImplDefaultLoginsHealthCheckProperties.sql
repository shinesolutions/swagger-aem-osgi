--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_default_logins_health_chec'
--
SELECT hc/tags, account/logins, console/logins FROM com_adobe_granite_repository_hc_impl_default_logins_health_chec WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_default_logins_health_chec'
--
INSERT INTO com_adobe_granite_repository_hc_impl_default_logins_health_chec (hc/tags, account/logins, console/logins) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_default_logins_health_chec'
--
UPDATE com_adobe_granite_repository_hc_impl_default_logins_health_chec SET hc/tags = ?, account/logins = ?, console/logins = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_default_logins_health_chec'
--
DELETE FROM com_adobe_granite_repository_hc_impl_default_logins_health_chec WHERE 1=2;

