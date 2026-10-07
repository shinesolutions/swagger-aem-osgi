--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplIMSProviderImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsImplIMSProviderImplProperties`
--
SELECT `oauth.provider.id`, `oauth.provider.ims.authorization.url`, `oauth.provider.ims.token.url`, `oauth.provider.ims.profile.url`, `oauth.provider.ims.extended.details.urls`, `oauth.provider.ims.validate.token.url`, `oauth.provider.ims.session.property`, `oauth.provider.ims.service.token.client.id`, `oauth.provider.ims.service.token.client.secret`, `oauth.provider.ims.service.token`, `ims.org.ref`, `ims.group.mapping`, `oauth.provider.ims.only.license.group` FROM `comAdobeGraniteAuthImsImplIMSProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsImplIMSProviderImplProperties`
--
INSERT INTO `comAdobeGraniteAuthImsImplIMSProviderImplProperties`(`oauth.provider.id`, `oauth.provider.ims.authorization.url`, `oauth.provider.ims.token.url`, `oauth.provider.ims.profile.url`, `oauth.provider.ims.extended.details.urls`, `oauth.provider.ims.validate.token.url`, `oauth.provider.ims.session.property`, `oauth.provider.ims.service.token.client.id`, `oauth.provider.ims.service.token.client.secret`, `oauth.provider.ims.service.token`, `ims.org.ref`, `ims.group.mapping`, `oauth.provider.ims.only.license.group`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsImplIMSProviderImplProperties`
--
UPDATE `comAdobeGraniteAuthImsImplIMSProviderImplProperties` SET `oauth.provider.id` = ?, `oauth.provider.ims.authorization.url` = ?, `oauth.provider.ims.token.url` = ?, `oauth.provider.ims.profile.url` = ?, `oauth.provider.ims.extended.details.urls` = ?, `oauth.provider.ims.validate.token.url` = ?, `oauth.provider.ims.session.property` = ?, `oauth.provider.ims.service.token.client.id` = ?, `oauth.provider.ims.service.token.client.secret` = ?, `oauth.provider.ims.service.token` = ?, `ims.org.ref` = ?, `ims.group.mapping` = ?, `oauth.provider.ims.only.license.group` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsImplIMSProviderImplProperties`
--
DELETE FROM `comAdobeGraniteAuthImsImplIMSProviderImplProperties` WHERE 0;

