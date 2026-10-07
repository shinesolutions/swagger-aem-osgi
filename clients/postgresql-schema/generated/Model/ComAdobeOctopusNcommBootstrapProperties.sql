--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeOctopusNcommBootstrapProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_octopus_ncomm_bootstrap_properties'
--
SELECT max_connections, max_requests, request_timeout, request_retries, launch_timeout FROM com_adobe_octopus_ncomm_bootstrap_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_octopus_ncomm_bootstrap_properties'
--
INSERT INTO com_adobe_octopus_ncomm_bootstrap_properties (max_connections, max_requests, request_timeout, request_retries, launch_timeout) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_octopus_ncomm_bootstrap_properties'
--
UPDATE com_adobe_octopus_ncomm_bootstrap_properties SET max_connections = ?, max_requests = ?, request_timeout = ?, request_retries = ?, launch_timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_octopus_ncomm_bootstrap_properties'
--
DELETE FROM com_adobe_octopus_ncomm_bootstrap_properties WHERE 1=2;

