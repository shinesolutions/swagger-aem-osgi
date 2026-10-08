--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheHttpProxyconfiguratorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_http_proxyconfigurator_properties'
--
SELECT proxy/enabled, proxy/host, proxy/port, proxy/user, proxy/password, proxy/exceptions FROM org_apache_http_proxyconfigurator_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_http_proxyconfigurator_properties'
--
INSERT INTO org_apache_http_proxyconfigurator_properties (proxy/enabled, proxy/host, proxy/port, proxy/user, proxy/password, proxy/exceptions) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_http_proxyconfigurator_properties'
--
UPDATE org_apache_http_proxyconfigurator_properties SET proxy/enabled = ?, proxy/host = ?, proxy/port = ?, proxy/user = ?, proxy/password = ?, proxy/exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_http_proxyconfigurator_properties'
--
DELETE FROM org_apache_http_proxyconfigurator_properties WHERE 1=2;

