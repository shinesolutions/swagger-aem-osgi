--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p'
--
SELECT scheduler/expression FROM com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p'
--
INSERT INTO com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p (scheduler/expression) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p'
--
UPDATE com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p SET scheduler/expression = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p'
--
DELETE FROM com_adobe_granite_oauth_server_impl_access_token_cleanup_task_p WHERE 1=2;

