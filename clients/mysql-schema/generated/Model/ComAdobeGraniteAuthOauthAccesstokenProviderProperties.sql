--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthAccesstokenProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthAccesstokenProviderProperties`
--
SELECT `name`, `auth.token.provider.title`, `auth.token.provider.default.claims`, `auth.token.provider.endpoint`, `auth.access.token.request`, `auth.token.provider.keypair.alias`, `auth.token.provider.conn.timeout`, `auth.token.provider.so.timeout`, `auth.token.provider.client.id`, `auth.token.provider.scope`, `auth.token.provider.reuse.access.token`, `auth.token.provider.relaxed.ssl`, `token.request.customizer.type`, `auth.token.validator.type` FROM `comAdobeGraniteAuthOauthAccesstokenProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthAccesstokenProviderProperties`
--
INSERT INTO `comAdobeGraniteAuthOauthAccesstokenProviderProperties`(`name`, `auth.token.provider.title`, `auth.token.provider.default.claims`, `auth.token.provider.endpoint`, `auth.access.token.request`, `auth.token.provider.keypair.alias`, `auth.token.provider.conn.timeout`, `auth.token.provider.so.timeout`, `auth.token.provider.client.id`, `auth.token.provider.scope`, `auth.token.provider.reuse.access.token`, `auth.token.provider.relaxed.ssl`, `token.request.customizer.type`, `auth.token.validator.type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthAccesstokenProviderProperties`
--
UPDATE `comAdobeGraniteAuthOauthAccesstokenProviderProperties` SET `name` = ?, `auth.token.provider.title` = ?, `auth.token.provider.default.claims` = ?, `auth.token.provider.endpoint` = ?, `auth.access.token.request` = ?, `auth.token.provider.keypair.alias` = ?, `auth.token.provider.conn.timeout` = ?, `auth.token.provider.so.timeout` = ?, `auth.token.provider.client.id` = ?, `auth.token.provider.scope` = ?, `auth.token.provider.reuse.access.token` = ?, `auth.token.provider.relaxed.ssl` = ?, `token.request.customizer.type` = ?, `auth.token.validator.type` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthAccesstokenProviderProperties`
--
DELETE FROM `comAdobeGraniteAuthOauthAccesstokenProviderProperties` WHERE 0;

