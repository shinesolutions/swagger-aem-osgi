--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplGithubProviderImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplGithubProviderImplProperties`
--
SELECT `oauth.provider.id`, `oauth.provider.github.authorization.url`, `oauth.provider.github.token.url`, `oauth.provider.github.profile.url` FROM `comAdobeGraniteAuthOauthImplGithubProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplGithubProviderImplProperties`
--
INSERT INTO `comAdobeGraniteAuthOauthImplGithubProviderImplProperties`(`oauth.provider.id`, `oauth.provider.github.authorization.url`, `oauth.provider.github.token.url`, `oauth.provider.github.profile.url`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplGithubProviderImplProperties`
--
UPDATE `comAdobeGraniteAuthOauthImplGithubProviderImplProperties` SET `oauth.provider.id` = ?, `oauth.provider.github.authorization.url` = ?, `oauth.provider.github.token.url` = ?, `oauth.provider.github.profile.url` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplGithubProviderImplProperties`
--
DELETE FROM `comAdobeGraniteAuthOauthImplGithubProviderImplProperties` WHERE 0;

