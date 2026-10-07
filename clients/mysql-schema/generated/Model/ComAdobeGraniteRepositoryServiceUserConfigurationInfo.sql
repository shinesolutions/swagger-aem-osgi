--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryServiceUserConfigurationInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryServiceUserConfigurationInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteRepositoryServiceUserConfigurationInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryServiceUserConfigurationInfo`
--
INSERT INTO `comAdobeGraniteRepositoryServiceUserConfigurationInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryServiceUserConfigurationInfo`
--
UPDATE `comAdobeGraniteRepositoryServiceUserConfigurationInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryServiceUserConfigurationInfo`
--
DELETE FROM `comAdobeGraniteRepositoryServiceUserConfigurationInfo` WHERE 0;

