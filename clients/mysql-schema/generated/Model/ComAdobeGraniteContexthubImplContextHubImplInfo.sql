--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteContexthubImplContextHubImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteContexthubImplContextHubImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteContexthubImplContextHubImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteContexthubImplContextHubImplInfo`
--
INSERT INTO `comAdobeGraniteContexthubImplContextHubImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteContexthubImplContextHubImplInfo`
--
UPDATE `comAdobeGraniteContexthubImplContextHubImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteContexthubImplContextHubImplInfo`
--
DELETE FROM `comAdobeGraniteContexthubImplContextHubImplInfo` WHERE 0;

