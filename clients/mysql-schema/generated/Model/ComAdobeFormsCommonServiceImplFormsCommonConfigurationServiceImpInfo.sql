--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo' definition.
--


--
-- SELECT template for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp` WHERE 1;

--
-- INSERT template for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp`
--
INSERT INTO `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp`
--
UPDATE `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp`
--
DELETE FROM `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp` WHERE 0;

