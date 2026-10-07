--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties`
--
SELECT `oauth.provider.id`, `oauth.cloud.config.root`, `provider.config.root`, `provider.config.create.tags.enabled`, `provider.config.user.folder`, `provider.config.facebook.fetch.fields`, `provider.config.facebook.fields`, `provider.config.refresh.userdata.enabled` FROM `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties`
--
INSERT INTO `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties`(`oauth.provider.id`, `oauth.cloud.config.root`, `provider.config.root`, `provider.config.create.tags.enabled`, `provider.config.user.folder`, `provider.config.facebook.fetch.fields`, `provider.config.facebook.fields`, `provider.config.refresh.userdata.enabled`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties`
--
UPDATE `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties` SET `oauth.provider.id` = ?, `oauth.cloud.config.root` = ?, `provider.config.root` = ?, `provider.config.create.tags.enabled` = ?, `provider.config.user.folder` = ?, `provider.config.facebook.fetch.fields` = ?, `provider.config.facebook.fields` = ?, `provider.config.refresh.userdata.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties`
--
DELETE FROM `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties` WHERE 0;

