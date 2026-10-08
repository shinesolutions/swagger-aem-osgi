--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties`
--
SELECT `oauth.provider.id`, `oauth.cloud.config.root`, `provider.config.root`, `provider.config.user.folder`, `provider.config.twitter.enable.params`, `provider.config.twitter.params`, `provider.config.refresh.userdata.enabled` FROM `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties`
--
INSERT INTO `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties`(`oauth.provider.id`, `oauth.cloud.config.root`, `provider.config.root`, `provider.config.user.folder`, `provider.config.twitter.enable.params`, `provider.config.twitter.params`, `provider.config.refresh.userdata.enabled`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties`
--
UPDATE `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties` SET `oauth.provider.id` = ?, `oauth.cloud.config.root` = ?, `provider.config.root` = ?, `provider.config.user.folder` = ?, `provider.config.twitter.enable.params` = ?, `provider.config.twitter.params` = ?, `provider.config.refresh.userdata.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties`
--
DELETE FROM `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties` WHERE 0;

