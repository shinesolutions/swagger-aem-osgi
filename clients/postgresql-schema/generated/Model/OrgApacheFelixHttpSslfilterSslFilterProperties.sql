--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixHttpSslfilterSslFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_http_sslfilter_ssl_filter_properties'
--
SELECT ssl_forward/header, ssl_forward/value, ssl_forward_cert/header, rewrite/absolute/urls FROM org_apache_felix_http_sslfilter_ssl_filter_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_http_sslfilter_ssl_filter_properties'
--
INSERT INTO org_apache_felix_http_sslfilter_ssl_filter_properties (ssl_forward/header, ssl_forward/value, ssl_forward_cert/header, rewrite/absolute/urls) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_http_sslfilter_ssl_filter_properties'
--
UPDATE org_apache_felix_http_sslfilter_ssl_filter_properties SET ssl_forward/header = ?, ssl_forward/value = ?, ssl_forward_cert/header = ?, rewrite/absolute/urls = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_http_sslfilter_ssl_filter_properties'
--
DELETE FROM org_apache_felix_http_sslfilter_ssl_filter_properties WHERE 1=2;

