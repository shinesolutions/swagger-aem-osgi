--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCommonsHttpclientProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_commons_httpclient_properties'
--
SELECT proxy/enabled, proxy/host, proxy/user, proxy/password, proxy/ntlm/host, proxy/ntlm/domain, proxy/exceptions FROM com_day_commons_httpclient_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_commons_httpclient_properties'
--
INSERT INTO com_day_commons_httpclient_properties (proxy/enabled, proxy/host, proxy/user, proxy/password, proxy/ntlm/host, proxy/ntlm/domain, proxy/exceptions) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_commons_httpclient_properties'
--
UPDATE com_day_commons_httpclient_properties SET proxy/enabled = ?, proxy/host = ?, proxy/user = ?, proxy/password = ?, proxy/ntlm/host = ?, proxy/ntlm/domain = ?, proxy/exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_commons_httpclient_properties'
--
DELETE FROM com_day_commons_httpclient_properties WHERE 1=2;

