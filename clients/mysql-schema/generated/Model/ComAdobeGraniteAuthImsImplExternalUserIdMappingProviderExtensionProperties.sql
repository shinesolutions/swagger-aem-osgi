--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension`
--
SELECT `oauth.provider.id` FROM `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension`
--
INSERT INTO `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension`(`oauth.provider.id`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension`
--
UPDATE `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension` SET `oauth.provider.id` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension`
--
DELETE FROM `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension` WHERE 0;

