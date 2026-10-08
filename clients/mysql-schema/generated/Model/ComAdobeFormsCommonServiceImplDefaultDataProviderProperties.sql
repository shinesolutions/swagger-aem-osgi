--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFormsCommonServiceImplDefaultDataProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeFormsCommonServiceImplDefaultDataProviderProperties`
--
SELECT `alloweddataFileLocations` FROM `comAdobeFormsCommonServiceImplDefaultDataProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeFormsCommonServiceImplDefaultDataProviderProperties`
--
INSERT INTO `comAdobeFormsCommonServiceImplDefaultDataProviderProperties`(`alloweddataFileLocations`) VALUES (?);

--
-- UPDATE template for table `comAdobeFormsCommonServiceImplDefaultDataProviderProperties`
--
UPDATE `comAdobeFormsCommonServiceImplDefaultDataProviderProperties` SET `alloweddataFileLocations` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFormsCommonServiceImplDefaultDataProviderProperties`
--
DELETE FROM `comAdobeFormsCommonServiceImplDefaultDataProviderProperties` WHERE 0;

