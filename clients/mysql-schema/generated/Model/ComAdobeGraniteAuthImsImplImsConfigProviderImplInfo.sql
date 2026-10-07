--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplImsConfigProviderImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo`
--
INSERT INTO `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo`
--
UPDATE `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo`
--
DELETE FROM `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo` WHERE 0;

