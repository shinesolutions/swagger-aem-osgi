--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthProviderProperties`
--
SELECT `oauth.config.id`, `oauth.client.id`, `oauth.client.secret`, `oauth.scope`, `oauth.config.provider.id`, `oauth.create.users`, `oauth.userid.property`, `force.strict.username.matching`, `oauth.encode.userids`, `oauth.hash.userids`, `oauth.callBackUrl`, `oauth.access.token.persist`, `oauth.access.token.persist.cookie`, `oauth.csrf.state.protection`, `oauth.redirect.request.params`, `oauth.config.siblings.allow` FROM `comAdobeGraniteAuthOauthProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthProviderProperties`
--
INSERT INTO `comAdobeGraniteAuthOauthProviderProperties`(`oauth.config.id`, `oauth.client.id`, `oauth.client.secret`, `oauth.scope`, `oauth.config.provider.id`, `oauth.create.users`, `oauth.userid.property`, `force.strict.username.matching`, `oauth.encode.userids`, `oauth.hash.userids`, `oauth.callBackUrl`, `oauth.access.token.persist`, `oauth.access.token.persist.cookie`, `oauth.csrf.state.protection`, `oauth.redirect.request.params`, `oauth.config.siblings.allow`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthProviderProperties`
--
UPDATE `comAdobeGraniteAuthOauthProviderProperties` SET `oauth.config.id` = ?, `oauth.client.id` = ?, `oauth.client.secret` = ?, `oauth.scope` = ?, `oauth.config.provider.id` = ?, `oauth.create.users` = ?, `oauth.userid.property` = ?, `force.strict.username.matching` = ?, `oauth.encode.userids` = ?, `oauth.hash.userids` = ?, `oauth.callBackUrl` = ?, `oauth.access.token.persist` = ?, `oauth.access.token.persist.cookie` = ?, `oauth.csrf.state.protection` = ?, `oauth.redirect.request.params` = ?, `oauth.config.siblings.allow` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthProviderProperties`
--
DELETE FROM `comAdobeGraniteAuthOauthProviderProperties` WHERE 0;

