--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp`
--
SELECT `facebook`, `twitter`, `provider.config.user.folder` FROM `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp`
--
INSERT INTO `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp`(`facebook`, `twitter`, `provider.config.user.folder`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp`
--
UPDATE `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp` SET `facebook` = ?, `twitter` = ?, `provider.config.user.folder` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp`
--
DELETE FROM `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProp` WHERE 0;

