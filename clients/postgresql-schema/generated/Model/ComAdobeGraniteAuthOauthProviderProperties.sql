--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_provider_properties'
--
SELECT oauth/config/id, oauth/client/id, oauth/client/secret, oauth/scope, oauth/config/provider/id, oauth/create/users, oauth/userid/property, force/strict/username/matching, oauth/encode/userids, oauth/hash/userids, oauth/call_back_url, oauth/access/token/persist, oauth/access/token/persist/cookie, oauth/csrf/state/protection, oauth/redirect/request/params, oauth/config/siblings/allow FROM com_adobe_granite_auth_oauth_provider_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_provider_properties'
--
INSERT INTO com_adobe_granite_auth_oauth_provider_properties (oauth/config/id, oauth/client/id, oauth/client/secret, oauth/scope, oauth/config/provider/id, oauth/create/users, oauth/userid/property, force/strict/username/matching, oauth/encode/userids, oauth/hash/userids, oauth/call_back_url, oauth/access/token/persist, oauth/access/token/persist/cookie, oauth/csrf/state/protection, oauth/redirect/request/params, oauth/config/siblings/allow) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_provider_properties'
--
UPDATE com_adobe_granite_auth_oauth_provider_properties SET oauth/config/id = ?, oauth/client/id = ?, oauth/client/secret = ?, oauth/scope = ?, oauth/config/provider/id = ?, oauth/create/users = ?, oauth/userid/property = ?, force/strict/username/matching = ?, oauth/encode/userids = ?, oauth/hash/userids = ?, oauth/call_back_url = ?, oauth/access/token/persist = ?, oauth/access/token/persist/cookie = ?, oauth/csrf/state/protection = ?, oauth/redirect/request/params = ?, oauth/config/siblings/allow = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_provider_properties'
--
DELETE FROM com_adobe_granite_auth_oauth_provider_properties WHERE 1=2;

