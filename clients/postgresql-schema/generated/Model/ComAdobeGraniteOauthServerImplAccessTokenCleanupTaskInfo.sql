--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i'
--
SELECT pid, title, description, properties FROM com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i'
--
INSERT INTO com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i'
--
UPDATE com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i'
--
DELETE FROM com_adobe_granite_oauth_server_impl_access_token_cleanup_task_i WHERE 1=2;

