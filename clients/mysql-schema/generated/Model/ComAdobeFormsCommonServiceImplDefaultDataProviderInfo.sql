--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFormsCommonServiceImplDefaultDataProviderInfo' definition.
--


--
-- SELECT template for table `comAdobeFormsCommonServiceImplDefaultDataProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeFormsCommonServiceImplDefaultDataProviderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeFormsCommonServiceImplDefaultDataProviderInfo`
--
INSERT INTO `comAdobeFormsCommonServiceImplDefaultDataProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFormsCommonServiceImplDefaultDataProviderInfo`
--
UPDATE `comAdobeFormsCommonServiceImplDefaultDataProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFormsCommonServiceImplDefaultDataProviderInfo`
--
DELETE FROM `comAdobeFormsCommonServiceImplDefaultDataProviderInfo` WHERE 0;

