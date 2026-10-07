--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplImsConfigProviderImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties`
--
SELECT `oauth.configmanager.ims.configid`, `ims.owningEntity`, `aem.instanceId`, `ims.serviceCode` FROM `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties`
--
INSERT INTO `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties`(`oauth.configmanager.ims.configid`, `ims.owningEntity`, `aem.instanceId`, `ims.serviceCode`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties`
--
UPDATE `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties` SET `oauth.configmanager.ims.configid` = ?, `ims.owningEntity` = ?, `aem.instanceId` = ?, `ims.serviceCode` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties`
--
DELETE FROM `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties` WHERE 0;

